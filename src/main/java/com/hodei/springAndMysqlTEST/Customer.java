package com.hodei.springAndMysqlTEST;

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
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String city;
    private String zip;
    private boolean vip;

    public Customer(){

    }
    public Customer(int id, String name, String lastname, String email, String password, String phone, String address, String city, String zip, boolean vip) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.zip = zip;
        this.vip = vip;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
