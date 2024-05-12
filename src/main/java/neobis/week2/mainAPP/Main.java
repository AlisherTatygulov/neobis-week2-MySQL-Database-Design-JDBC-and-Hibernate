package neobis.week2.mainAPP;

import neobis.week2.dao.CustomerDAO;
import neobis.week2.dao.CustomerDAOImpl;
import neobis.week2.entity.Customer;
import neobis.week2.service.CustomerService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            String url = "jdbc:mysql://localhost:3306/book_shop";
            String username = "springstudent";
            String password = "springstudent";

            Connection connection = DriverManager.getConnection(url, username, password);
            CustomerDAO customerDAO = new CustomerDAOImpl(connection);
            CustomerService customerService = new CustomerService(customerDAO);
            /*
            Customer customer1 = new Customer(null, "John Snow", "+877725487", "snow@mail.com");
            Customer customer2 = new Customer(null, " Myley Sirus", "+58795654", "Miley@mail.com");
            Customer customer3 = new Customer(null, "Geralt de Rivia", "+55489476", "Geralt@mail.com");
            Customer customer4 = new Customer(null, "Zoro Roronoa", "+44651616516", "Zoro@mail.com");

            customerService.createCustomer(customer1);
            customerService.createCustomer(customer2);
            customerService.createCustomer(customer3);
            customerService.createCustomer(customer4);
                                                        */

            Customer customerFromDB = customerService.findCustomerById(1L);

            System.out.println(customerService.getAllCustomers());

            System.out.println(customerFromDB);

            customerFromDB.setName("Peter Jackson");
            customerService.updateCustomer(customerFromDB);

            customerService.deleteCustomer(2L);

            System.out.println(customerService.getAllCustomers());









        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
