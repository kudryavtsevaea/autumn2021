package com.netcracker.project;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.Scanner;

public class KeyListeners implements KeyListener {

    private Library lib;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        String info;
        try (Scanner sc = new Scanner(System.in)){
            info = sc.nextLine();
        }
        if (e.getKeyCode() == KeyEvent.VK_Q){
            System.out.println("До свидания!");
            System.exit(0);
        }
        else if (e.getKeyCode() == KeyEvent.VK_0){
            //просмотреть все взятые книги
            try {
                lib.showAllBooksOnHands();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_1){
            //взять книгу
            lib.getBook(info);
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_2){
            //вернуть книгу

            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_3){
            //найти книгу
            try {
                lib.findBookByName();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_4){
            lib.showAllBooks();
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_5){
            //добавить пользователя
            //addUser
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_6){
            //удалить пользователя
            try {
                lib.deleteReader(info);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_7){
            //удалить книгу
            try {
                lib.deleteBook(info);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_8){
            //добавить книгу
            //addBook
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_9){
            //просмотреть всех пользователей
            lib.showAllUsers();
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_W){
            //изменить поле читателя

            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_E){
            //изменить поле книги

            System.out.println("<- Назад         Выход(q)");
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            //переход в меню
            LibrarySystem.printMenu();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
