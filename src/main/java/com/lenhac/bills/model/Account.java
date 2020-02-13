package com.lenhac.bills.model;

import javax.persistence.*;

@Entity
@Table(name = "accounts")

public class Account extends AuditModel {

    @Id
    @GeneratedValue(generator = "account_generator")
    @SequenceGenerator(
            name = "account_generator",
            sequenceName = "account_generator",
            initialValue = 100120
    )
    private Long accountId;

    private String accountName;
    private long userId;
    private double accountBalance;

}
