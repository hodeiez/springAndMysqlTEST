package com.hodei.springAndMysqlTEST;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Hodei Eceiza
 * Date: 4/4/2021
 * Time: 23:54
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */
public class Profile {

    private String name;
    private String lastname;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String city;
    private String zip;
    private boolean vip;

    public Profile(Customer customer){


        this.name = customer.getName();
        this.lastname = customer.getLastname();
        this.email = customer.getEmail();

        this.phone = customer.getPhone();
        this.address = customer.getAddress();
        this.city = customer.getCity();
        this.zip = customer.getZip();
        this.vip = customer.isVip();
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
