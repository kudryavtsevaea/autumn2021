package com.netcracker.project;

import javafx.scene.input.KeyCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

//view class, controller???
public class LibrarySystem{

    public static void printMenu(){
        System.out.println("Добро пожаловать в библиотеку!\n" +
                "Для Вас доступны следующие операции:\n"+
                "0.  Просмотр всех выданных книг;\n" +
                "1.  Взять книгу;\n" +
                "2.  Вернуть книгу;\n" +
                "3.  Найти книгу по названию\n" +
                "4.  Просмотр всех книг;\n" +
                "5.  Добавить пользователя;\n" +
                "6.  Удалить пользователя;\n" +
                "7.  Удалить книгу;\n" +
                "8.  Добавить книгу;\n" +
                "9.  Просмотр всех пользователей;\n" +
                "10. Редактировать пользователя;\n" +
                "11. Редактировать книгу;\n" +
                "q.  Выход.\n");
        System.out.print("Выберете операцию : ");
    }
}
