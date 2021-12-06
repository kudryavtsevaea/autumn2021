package com.netcracker.project;

import groovy.sql.DataSet;

import java.awt.print.Book;
import java.util.HashMap;

public class SpecificBook<I extends Number, B> extends Book {

    private boolean isHandedOut;
    private int inventoryNumber;
    private Book book;
   // private HashMap<Integer, Book> specificbooks = new HashMap<>();

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public boolean isHandedOut() {
        return isHandedOut;
    }

    public SpecificBook(int inventoryNumberString, String author, String nameOfBook
            , int yearOfPublishing, int amountOfPages) {
        this.book = new Book();
        this.inventoryNumber = inventoryNumber;
        this.isHandedOut = false;
    }
}
