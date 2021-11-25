package com.netcracker.lesson;

public class App 
{
    public static void main( String[] args )
    {
        float a = 100;
        float b = 5;

        Calculator calculator = new Calculator();
        System.out.println("Умножение " + calculator.multiple(a, b));
        System.out.println("Деление " + calculator.devide(a, b));
        System.out.println("Вычитание " + calculator.minus(b, a));
        System.out.println("Сложение " + calculator.add(a, b));

    }
}
