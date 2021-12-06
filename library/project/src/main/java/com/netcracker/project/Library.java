package com.netcracker.project;

import groovy.sql.DataSet;

import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

//model class
public class Library {

    private List<Book> books;
    private List<SpecificBook> specifBooks;
    private List<User> users;
    private static Library INSTANCE = null;
    Connection connection = DriverManager.getConnection
                ("jdbc:mysql://127.0.0.1:3306/librarydb", "root", "kryasan2");

    private Library() throws SQLException {
        //File file = new File("E:\\NetCracker2021\\autumn2021\\library\\project" +
        //      "\\src\\main\\resources\\data.properties");

       // Properties properties = new Properties();
       // properties.loadFromXML();
            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from book");
            ResultSet resultSet1 = preparedStatement1.executeQuery();
            while (resultSet1.next()) {
                Book book = new Book(resultSet1.getString(1), resultSet1.getString(2),
                        resultSet1.getInt(3), resultSet1.getInt(4));
            books.add(book);
            }

            PreparedStatement preparedStatement2 = connection.prepareStatement("select * from reader");
            ResultSet resultSet2 = preparedStatement2.executeQuery();
            while (resultSet2.next()) {
                User user = new User(resultSet2.getInt(1), resultSet2.getString(2),
                        resultSet2.getBoolean(3), resultSet2.getInt(4));
                users.add(user);
            }
//
//            PreparedStatement preparedStatement3 = connection.prepareStatement("select * from specificbook");
//            ResultSet resultset3 = preparedStatement3.executeQuery();
//            for (Book b : books){
//            while (resultset3.next()){
//                specifBooks.replace(resultset3.getInt(1), b);
//            }
//            }

    }
        public static Library getInstance() throws SQLException {
        if (INSTANCE == null) {
            synchronized (Library.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Library();
                }
            }
        }
        return INSTANCE;
    }

    public void showAllBooks() {
        books.forEach(System.out::println);
    }

    public  void showAllUsers(){
        users.forEach(System.out::println);
    }

    public void getBook(String name){
        System.out.println(specifBooks.stream().filter((b) -> b.equals(name))
                .collect(Collectors.toList()));
        //добавить изменение флага
    }

    public static final String DELETE_USER = "delete from reader where readerName = name";

    public void deleteReader(String name) throws SQLException {
        if (users.contains(name)) {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER);
        }
        else {
            System.out.println("Данный пользователь не существует");
        }
    }

    public static final String DELETE_BOOK = "delete from book where nameOfBook = name";

     public void deleteBook(String name) throws SQLException {
         if (books.contains(name)){
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BOOK);
         }
         else {
             System.out.println("Данной книге нет в библиотеке");
         }
     }

    public void showAllBooksOnHands() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(FIND_BOOK_ON_HANDS);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " +
                resultSet.getBoolean(3));
    }

    public static final String FIND_BOOK_ON_HANDS = "select * from specificbook where isHandedOut = 1";


    public void addBook(Book book, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_BOOK);
        preparedStatement.setString(1, book.getAuthor());
        preparedStatement.setString(2, book.getNameOfBook());
        preparedStatement.setInt(3, book.getYearOfPublishing());
        preparedStatement.setInt(4, book.getAmountOfPages());
    }

    public static final String INSERT_BOOK = "insert into book " +
            "(\"author\",\"nameOfBook\", \"yearOfPublishing\",\"amountOfPages\")  values (?,?,?,?)";

    public void addUser(User user, Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_READER);
        preparedStatement.setString(1, user.getReaderName());
        preparedStatement.setBoolean(2, user.isHasBook());
        preparedStatement.setInt(3, user.getWhichBook());
    }

    public static final String INSERT_READER = "insert into readerWithBook " +
            "(\"readerName\",\"hasBook\", \"whichBook\")  values (?,?,?)";

    public static final String FIND_BOOK = "select * from book where nameOfBook = name";

    public void findBookByName() throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(FIND_BOOK);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) +
             " " + resultSet.getInt(3) +  " " + resultSet.getInt(4));
    }

}
