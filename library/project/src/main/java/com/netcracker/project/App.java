package com.netcracker.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.sql.DriverManager.getConnection;

public class App extends SpringBootServletInitializer
{
    public static void main(String[] args) throws Exception
    {
       // DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
//        try(Connection connection = DriverManager.getConnection
//                ("jdbc:mysql://127.0.0.1:3306/librarydb", "root", "kryasan2")){
//            connection.setAutoCommit(false);
//            PreparedStatement preparedStatement = connection.prepareStatement("select * from book");
//            ResultSet resultSet1 = preparedStatement.executeQuery();
//            while (resultSet1.next()) {
//                System.out.println(resultSet1.getString(2));
//            }
//            connection.commit();
//        }

        LibrarySystem librarySystem = new LibrarySystem();
        KeyListeners keyListeners = new KeyListeners();
        librarySystem.printMenu();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String operation = sc.nextLine();
            if (operation.equals("0") || operation.equals("1") || operation.equals("<") || operation.equals("q")) {
                if (operation.equals("0")) {
                    keyListeners.keyPressed("0");
                } else if (operation.equals("1")) {
                   keyListeners.keyPressed("1");
                } else if (operation.equals("<")){
                   keyListeners.keyPressed("<");
                }
                else
                {
                    keyListeners.keyPressed("q");
                }

            }
        }

    }
}
