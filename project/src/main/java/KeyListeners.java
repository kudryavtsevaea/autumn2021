import java.sql.SQLException;
import java.util.Scanner;

public class KeyListeners{

    private Library lib;

    public void keyPressed(String e) {
        String info;
        try (Scanner sc = new Scanner(System.in)){
            info = sc.nextLine();
        }
        if (e == "q"){
            System.out.println("До свидания!");
            System.exit(0);
        }
        else if (e == "0"){
            //просмотреть все взятые книги
            try {
                lib.showAllBooksOnHands();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "1"){
            //взять книгу
            lib.getBook(info);
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "2"){
            //вернуть книгу

            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "3"){
            //найти книгу
            lib.findBookByName(info);
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "4"){
            lib.showAllBooks();
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "5"){
            //добавить пользователя
            //addUser
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "6"){
            //удалить пользователя
            lib.deleteReader(info);
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "7"){
            //удалить книгу
            lib.deleteBook(info);
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "8"){
            //добавить книгу
            //addBook
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "9"){
            //просмотреть всех пользователей
            lib.showAllUsers();
            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "10"){
            //изменить поле читателя

            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "11"){
            //изменить поле книги

            System.out.println("<- Назад         Выход(q)");
        }
        else if (e == "<"){
            //переход в меню
            LibrarySystem.printMenu();
        }
    }

}
