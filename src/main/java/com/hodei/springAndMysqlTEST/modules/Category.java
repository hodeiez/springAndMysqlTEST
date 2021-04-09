package com.hodei.springAndMysqlTEST.modules;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by Hodei Eceiza
 * Date: 4/9/2021
 * Time: 11:28
 * Project: springAndMysqlTEST
 * Copyright: MIT
 */


@Entity
@Table(name="category")
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
}
