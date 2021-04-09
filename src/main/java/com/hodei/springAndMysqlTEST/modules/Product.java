package com.hodei.springAndMysqlTEST.modules;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Hodei Eceiza
 * Date: 4/9/2021
 * Time: 11:20
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */




@Entity
@Table(name="product")
@Getter
@Setter
public class Product {
    @OneToOne
    //@JoinColumn(name="categoryID", table="category")
    @JoinColumn(name="categoryID",insertable=false,updatable = false)
    private Category category;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String image;
    private double price;

    private int categoryID;


    public Category getCategory(){
        return category;
    }
    public void setCategory(Category category){
        this.category=category;
    }


}
