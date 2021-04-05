package com.hodei.springAndMysqlTEST;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hodei Eceiza
 * Date: 4/4/2021
 * Time: 22:11
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
