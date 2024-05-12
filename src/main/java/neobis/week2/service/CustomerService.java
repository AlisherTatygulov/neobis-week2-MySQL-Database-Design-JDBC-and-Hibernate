package neobis.week2.service;

import neobis.week2.dao.CustomerDAO;
import neobis.week2.entity.Customer;

import java.util.List;

public class CustomerService {
    private CustomerDAO customerDAO;

    public CustomerService(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void createCustomer(Customer customer) {
        customerDAO.save(customer);
    }

    public Customer findCustomerById(Long id) {
        return customerDAO.findById(id);
    }

    public List<Customer> getAllCustomers() {
        return customerDAO.findAll();
    }

    public void updateCustomer(Customer customer) {
        customerDAO.update(customer);
    }

    public void deleteCustomer(Long id) {
        customerDAO.delete(id);
    }
}
