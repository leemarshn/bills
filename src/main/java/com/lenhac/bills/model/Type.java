package com.lenhac.bills.model;

import javax.persistence.*;

@Entity
@Table(name = "types")
public class Type {

    @Id
    @GeneratedValue(generator = "type_generator")
    @SequenceGenerator(
            name = "type_generator",
            sequenceName = "type_generator",
            initialValue = 1000
    )
    private Long typeId;

    private String typeName;

    private long categoryId;

}
