package com.hodei.springAndMysqlTEST.services;

import com.hodei.springAndMysqlTEST.modules.Product;
import com.hodei.springAndMysqlTEST.repos.CustomerRepository;
import com.hodei.springAndMysqlTEST.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Hodei Eceiza
 * Date: 4/9/2021
 * Time: 11:42
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */
@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @CrossOrigin
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
