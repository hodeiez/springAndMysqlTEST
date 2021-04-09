package com.hodei.springAndMysqlTEST.repos;

import com.hodei.springAndMysqlTEST.modules.Customer;
import com.hodei.springAndMysqlTEST.modules.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hodei Eceiza
 * Date: 4/9/2021
 * Time: 11:40
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
