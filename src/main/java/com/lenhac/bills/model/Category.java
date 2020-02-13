package com.lenhac.bills.model;


import javax.persistence.*;

@Entity
@Table(name = "catgories")

public class Category {
    @Id
    @GeneratedValue(generator = "category_generator")
    @SequenceGenerator(
            name = "category_generator",
            sequenceName = "category_generator",
            initialValue = 12
    )
    private Long categoryId;
    private String categoryName;
}
