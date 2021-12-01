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

    private List<User> users = new ArrayList<>();

    public String getReaderName() {
        return readerName;
    }

    public boolean isHasBook() {
        return hasBook;
    }

    public Book getWhichBook() {
        return whichBook;
    }

    public static void addUser(User user, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_READER);
        preparedStatement.setString(1, user.getReaderName());
        preparedStatement.setBoolean(2, user.isHasBook());
        preparedStatement.setString(3, user.getWhichBook().toString());
    }

    public static final String INSERT_READER = "insert into reader " +
            "(\"readerName\",\"hasBook\", \"whichBook\")  values (?,?,?)";

    public void getInfo(User user){
        if (users.contains(user)){
            System.out.println(user);
        }
        else
        {
            System.out.println("Данный пользователь не зарегистрирован в системе.");
        }
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
