package org.example;

import lombok.SneakyThrows;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.*;
import java.util.stream.Collectors;

public class ApplicationContext {
    private Map<String, Object> beans = new HashMap<>();

    @SneakyThrows
    public void init(Class<?>[] clazz) {
        for (int j = 0; j < clazz.length; j++){
        Method[] methods = clazz[j].getDeclaredMethods();

        List<Method> methodList = Arrays.stream(methods).sorted(Comparator.comparing(method -> method.getParameters().length)).collect(Collectors.toList());
        for (Method method : methodList) {
            if (method.isAnnotationPresent(Bean.class)) {
                method.setAccessible(true);
                Object[] parameters = new Object[method.getParameters().length];
                for (int i = 0; i < method.getParameters().length; i++) {
                    if (List.class.equals(method.getParameters()[i].getType())) {
                        parameters[i] = getBeans(((Class) ((ParameterizedType) method.getParameters()[i].getParameterizedType()).getActualTypeArguments()[0]));
                    } else {
                        parameters[i] = getBean(method.getParameters()[i].getType());
                    }
                }
                String name;
                if ("".equals(method.getAnnotation(Bean.class).value())) {
                    name = method.getName();
                } else {
                    name = method.getAnnotation(Bean.class).value();
                }

                beans.put(name, method.invoke(null, parameters));
                method.setAccessible(false);

            }

        }
        }
    }

    @SneakyThrows
    public void rewrite(Class<?>[] clazz) {
        Method[] methods = clazz.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Prototype.class)) {
                method.setAccessible(true);
                beans.remove(method);
            }
            method.setAccessible(false);
        }
        init(clazz);
    }

    public <T> T getBean(Class<T> clazz) {
        return (T) beans.values().stream().filter(object -> clazz.isAssignableFrom(object.getClass())).findFirst().get();
    }

    public <T> List<T> getBeans(Class<T> clazz) {
        return (List<T>) beans.values().stream().filter(object -> clazz.isAssignableFrom(object.getClass())).collect(Collectors.toList());
    }

    public <T> T getBean(String name, Class<T> clazz) {
        return (T) beans.get(name);
    }
}