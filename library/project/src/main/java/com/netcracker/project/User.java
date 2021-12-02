package com.netcracker.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String readerName;
    private boolean hasBook;
    private Book whichBook;

    public String getReaderName() {
        return readerName;
    }

    public boolean isHasBook() {
        return hasBook;
    }

    public Book getWhichBook() {
        return whichBook;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", readerName='" + readerName + '\'' +
                ", hasBook=" + hasBook +
                ", whichBook=" + whichBook +
                '}';
    }
}
