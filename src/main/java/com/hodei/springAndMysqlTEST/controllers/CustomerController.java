package com.hodei.springAndMysqlTEST.controllers;

import com.hodei.springAndMysqlTEST.services.CustomerService;
import com.hodei.springAndMysqlTEST.modules.Customer;
import com.hodei.springAndMysqlTEST.modules.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Hodei Eceiza
 * Date: 4/4/2021
 * Time: 22:16
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */
@RestController
@RequestMapping("/users")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("")
    @CrossOrigin
    public List<Customer> list() {
        return customerService.listAllCustomer();
    }
    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Customer> get(@PathVariable Integer id) {
        try{
            Customer customer=customerService.getCustomer(id);
            return new ResponseEntity<Customer>(customer, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    /*
    @GetMapping("/{email}{password}")
    public ResponseEntity<Customer> getByPass(@PathVariable String email,@PathVariable String password){

     */
    @RequestMapping(value="profile",method=RequestMethod.GET)
    public ResponseEntity<Profile> getByPass(@RequestParam("email") String email, @RequestParam("pass") String password){
        try{
            Customer customer=customerService.getCustomerByPass(email,password);
           Profile profile=new Profile(customer);

            return new ResponseEntity<Profile>(profile, HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping(value="/register",consumes="application/json",produces="application/json")
    public int add(@RequestBody Customer customer){
         customerService.saveCustomer(new Customer(customer.getId(), customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPassword(), customer.getTelephone(), customer.getAddress(), customer.getCity(), customer.getZip()));
         return customer.getId();
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> update (@RequestBody Customer customer, @PathVariable Integer id){
        try{
            Customer existCustomer=customerService.getCustomer(id);
            customer.setId(id);
            customerService.saveCustomer(customer);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @CrossOrigin
    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable Integer id){
        customerService.deleteCustomer(id);
    }
}
