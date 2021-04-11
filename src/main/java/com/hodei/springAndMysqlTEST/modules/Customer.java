package com.hodei.springAndMysqlTEST.modules;

import com.sun.istack.NotNull;

import javax.persistence.*;

/**
 * Created by Hodei Eceiza
 * Date: 4/4/2021
 * Time: 22:06
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private int id;

    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String telephone;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String zip;
    //private boolean vip;

    public Customer(){

    }

    public Customer(int id, String firstName, String lastname, String email, String password, String phone, String address, String city, String zip) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastname;
        this.email = email;
        this.password = password;
        this.telephone = phone;
        this.address = address;
        this.city = city;
        this.zip = zip;
        //  this.vip = vip;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String phone) {
        this.telephone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
/*
    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

 */
}
