package com.lenhac.bills.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;

@Entity
@Table(name = "bills")
public class Bill extends AuditModel {
    @Id
    @GeneratedValue(generator = "bills_generator")
    @SequenceGenerator(
            name = "bills_generator",
            sequenceName = "bills_sequence",
            initialValue = 1000
    )
    private int id;
    @NotNull
    @Size(min=2, max=30)
    private String item;
    private String description;
    private String category;
    private Date expenseDate;
    private double amount;
    private Boolean status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Temporal(DATE)
    @DateTimeFormat(pattern="YYYY-MM-dd")
    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
