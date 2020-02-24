package com.online.bank.digital.model;

/*
User X bank account detail.
Account Uid is an unique number representing a particular account
defaultCategory could be business or personal or charity
 */

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int accountUid;

    @Column(name = "description")
    private String description;

    @Column(name = "defaultCategory")
    private String defaultCategory;

    @Column(name = "currency")
    private String currency;

    @Column(name = "createdAt")
    private String createdAt;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAccountUid() {
        return accountUid;
    }

    public void setAccountUid(int accountUid) {
        this.accountUid = accountUid;
    }

    public String getDefaultCategory() {
        return defaultCategory;
    }

    public void setDefaultCategory(String defaultCategory) {
        this.defaultCategory = defaultCategory;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
