package com.luke.expenses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private double amount;

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

//    private LocalDate date;
//    private String businessName;
//    private String categoryName;
//    private LocalDate paymentDate;
//
//    @CreationTimestamp
//    private LocalDateTime createTime;
//
//    @UpdateTimestamp
//    private LocalDateTime updateTime;
}
