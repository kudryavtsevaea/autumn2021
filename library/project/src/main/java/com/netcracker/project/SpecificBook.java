package com.netcracker.project;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;

public class SpecificBook extends Book {
    private String author;
    private String nameOfBook;
    private int yearOfPublishing;
    private int amountOfPages;

    private int inventoryNumber;

    private HashMap<Integer, String> specificbooks = new HashMap<>();

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

    public SpecificBook(String author, String nameOfBook, int yearOfPublishing, int amountOfPages, int inventoryNumber) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.yearOfPublishing = yearOfPublishing;
        this.amountOfPages = amountOfPages;
        this.inventoryNumber = inventoryNumber;
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
