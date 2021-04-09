package com.hodei.springAndMysqlTEST.controllers;

import com.hodei.springAndMysqlTEST.modules.Product;
import com.hodei.springAndMysqlTEST.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 4/9/2021
 * Time: 11:44
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("")
    @CrossOrigin
    public List<Product> allProducts(){
        return productService.getAllProducts();
    }
}
