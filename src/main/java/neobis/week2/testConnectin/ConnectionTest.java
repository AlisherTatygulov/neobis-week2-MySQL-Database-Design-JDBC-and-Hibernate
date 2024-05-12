package neobis.week2.testConnectin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/book_shop";
        String username = "springstudent";
        String password = "springstudent";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Соединение установлено!");

            connection.close();
            System.out.println("Соединение звершено!");
        } catch (SQLException e) {
            System.out.println("Ошибка при установлении соединения: " + e.getMessage());
        }



    }
}
