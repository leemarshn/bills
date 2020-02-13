package com.lenhac.bills.model;


import javax.persistence.*;

@Entity
@Table(name = "users")

public class User extends AuditModel{

    @Id
    @GeneratedValue(generator = "user_generator")
    @SequenceGenerator(
            name = "user_generator",
            sequenceName = "user_generator",
            initialValue = 1000
    )
    private Long userId;

    @Column(columnDefinition = "text")
    private String fname;

    @Column(columnDefinition = "text")
    private String lname;

    @Column(columnDefinition = "text")
    private String username;

    @Column(columnDefinition = "text")
    private String email;

    @Column(columnDefinition = "text")
    private String password;

    private int accessLevel;






}
