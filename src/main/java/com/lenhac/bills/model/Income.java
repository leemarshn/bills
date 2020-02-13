package com.lenhac.bills.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "income")

public class Income extends AuditModel {

    @Id
    @GeneratedValue(generator = "income_generator")
    @SequenceGenerator(
            name = "income_generator",
            sequenceName = "income_generator",
            initialValue = 140123
    )
    private Long incomeId;

    private String incomeName;
    private String incomeDescription;
    private Double incomeAmount;
    private Date incomeDate;
    private long userId;
    private long accountId;
}
