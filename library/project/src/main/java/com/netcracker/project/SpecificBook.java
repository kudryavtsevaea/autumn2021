package com.netcracker.project;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SpecificBook extends Book {
    private String author;
    private String nameOfBook;
    private int yearOfPublishing;
    private int amountOfPages;

    private int inventoryNumber;

    public String getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    private static SpecificBook INSTANCE = new SpecificBook();

    private SpecificBook(){
       // addSpecificBook(INSTANCE, connection);
    }

    public static SpecificBook getInstance(){
        return INSTANCE;
    }


    public static void addSpecificBook(SpecificBook book, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SPECIFIC_BOOK);
        preparedStatement.setString(1, book.getAuthor());
        preparedStatement.setString(2, book.getNameOfBook());
        preparedStatement.setInt(3, book.getYearOfPublishing());
        preparedStatement.setInt(4, book.getAmountOfPages());
        preparedStatement.setInt(5, book.getInventoryNumber());
    }

    public static final String INSERT_SPECIFIC_BOOK = "insert into book " +
            "(\"author\",\"nameOfBook\", \"yearOfPublishing\",\"amountOfPages\")  values (?,?,?,?)";
    }
