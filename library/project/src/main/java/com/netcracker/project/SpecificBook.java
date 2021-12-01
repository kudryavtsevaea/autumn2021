package com.netcracker.project;

import java.awt.print.Book;

public class SpecificBook extends Book {

    private int inventoryNumber;

    private static SpecificBook INSTANCE = new SpecificBook();

    private SpecificBook(){
    }

    public static SpecificBook getInstance(){
        return INSTANCE;
    }


}
