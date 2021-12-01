package com.netcracker.project;

import java.util.Scanner;

//controller class
public class LibrarySystem implements LibraryStructure{

    @Override
    public void getTheOperation() {
        System.out.println("Доступные команды:\n" +
                "1. Просмотреть взятые книги;\n" +
                "2. Взять книгу;\n" +
                "3. Вернуть книгу;\n" +
                "4. Найти книгу в библиотеке;\n" +
                "5. Найти книгу в архиве.");
        System.out.print("Введите число от 1 до 5, соответствующее необходимой операции:");

        try (Scanner sc = new Scanner(System.in)){
            String operation = sc.nextLine();
            switch (operation){
                case "1": {

                };
                case "2": {

                };
                case "3": {

                }
                case "4": {

                }
                case "5": {

                }
                default:
                    System.out.println("Некорректная операция!");
            }
        }

    }


}
