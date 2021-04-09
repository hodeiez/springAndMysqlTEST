package com.hodei.springAndMysqlTEST.repos;

import com.hodei.springAndMysqlTEST.modules.Category;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hodei Eceiza
 * Date: 4/9/2021
 * Time: 11:41
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
