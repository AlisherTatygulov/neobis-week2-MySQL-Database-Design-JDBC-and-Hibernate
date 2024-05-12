package neobis.week2.dao;

import neobis.week2.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    void save(Customer customer);
    Customer findById(Long id);
    List<Customer> findAll();
    void update(Customer customer);
    void delete(Long id);
}
