package com.hodei.springAndMysqlTEST.services;

import com.hodei.springAndMysqlTEST.repos.CustomerRepository;
import com.hodei.springAndMysqlTEST.modules.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 4/4/2021
 * Time: 22:13
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */
@Service
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> listAllCustomer(){
        return customerRepository.findAll();

    }
    public void saveCustomer(Customer customer){
        customerRepository.save(customer);
    }
    public Customer getCustomer (Integer id){
        return customerRepository.findById(id).get();
    }
    public Customer getCustomerByPass (String email,String pass) {
        List<Customer> allCustomers = customerRepository.findAll();
        Customer toReturn = allCustomers.stream().filter(customer -> customer.getPassword().equals(pass) && customer.getEmail().equals(email)).findFirst().orElse(null);
        return toReturn; //dont wanna return the pass and id
    }
    public void deleteCustomer(Integer id){
        customerRepository.deleteById(id);
    }

}
