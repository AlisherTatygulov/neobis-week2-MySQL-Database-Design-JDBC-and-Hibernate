package neobis.week2.testConnectin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        /*String user = "springstudent";
        String pass = "springstudent";

        String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String driver = "com.mysql.jdbc.Driver";// Строка подключения к базе данных
       */

        // Строка подключения к базе данных
        String url = "jdbc:mysql://localhost:3306/book_shop";
        String username = "springstudent";
        String password = "springstudent";

        // Попытка установить соединение
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Соединение установлено!");
            // Здесь вы можете выполнить запросы к базе данных
            // Не забудьте закрыть соединение после использования
            connection.close();
        } catch (SQLException e) {
            System.out.println("Ошибка при установлении соединения: " + e.getMessage());
        }



    }
}
