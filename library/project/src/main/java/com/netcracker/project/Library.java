package com.netcracker.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class Library {

    private List<Book> books;

    public void showTheBook(String name) {
        Book book = books.stream().filter(b -> b.equals(name)).findFirst().get();
        if (book != null){
            System.out.println(book);
        }
        else{
            System.out.println("Такой книги нет в библиотеке.");
        }
    }

    //  public Book putBookInArchive(){}

    //    public Book giveTheBook(){}

    public static void addBook(Book book, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BOOK);
        preparedStatement.setString(1, book.getAuthor());
        preparedStatement.setString(2, book.getNameOfBook());
        preparedStatement.setInt(3, book.getYearOfPublishing());
        preparedStatement.setInt(4, book.getAmountOfPages());
    }

    public static final String INSERT_BOOK = "insert into book " +
            "(\"author\",\"nameOfBook\", \"yearOfPublishing\",\"amountOfPages\")  values (?,?,?,?)";

}
