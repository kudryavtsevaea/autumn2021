package com.netcracker.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Book {
    private String author;
    private String nameOfBook;
    private int yearOfPublishing;
    private int amountOfPages;

    public Book(String author, String nameOfBook, int yearOfPublishing, int amountOfPages) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.yearOfPublishing = yearOfPublishing;
        this.amountOfPages = amountOfPages;
    }

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

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", amountOfPages=" + amountOfPages +
                '}';
    }
}
