package com.netcracker.project;

import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

//view class, controller???
public class LibrarySystem{

    public static void printMenu(){
        System.out.println("Доступные команды:\n" +
                "0. Просмотреть взятые книги;\n" +
                "1. Взять книгу;\n" +
                "2. Вернуть книгу;\n" +
                "3. Найти книгу в библиотеке;\n" +
                "4. Просмотреть все книги;\n" +
                "5. Добавить пользователя;\n" +
                "6. Удалить пользователя; \n" +
                "7. Удалить книгу;\n" +
                "8. Добавить книгу; \n" +
                "9. Просмотреть всех пользователей.");
        System.out.print("Выберете операцию : ");
    }
}
