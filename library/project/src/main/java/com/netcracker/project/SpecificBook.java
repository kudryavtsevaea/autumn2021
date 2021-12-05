package com.netcracker.project;

import groovy.sql.DataSet;

import java.awt.print.Book;
import java.util.HashMap;

public class SpecificBook<I extends Number, B> extends Book {

    private boolean isHandedOut;
    private int inventoryNumber;

    private HashMap<Integer, Book> specificbooks = new HashMap<>();

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public SpecificBook(String author, String nameOfBook
            , int yearOfPublishing, int amountOfPages, int inventoryNumber) {
        super();
        this.inventoryNumber = inventoryNumber;
    }

//    public static void addSpecificBookXmL(SpecificBook book){
//        DataSet ds = new DataSet();
//        ds.Tables.Add("DataTableName");
//        ds.GetXml();
//    }
}
