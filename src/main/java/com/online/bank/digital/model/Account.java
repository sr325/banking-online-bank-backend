package com.online.bank.digital.model;

/*
User X bank account detail.
Account Uid is an unique number representing a particular account
defaultCategory could be business or personal or charity
 */

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "ACCOUNT")
public class Account {
    @Id
    @Column(name = "accountUid")
    private int accountUid;

    @Column(name = "description")
    private String description;

    @Column(name = "defaultCategory")
    private String defaultCategory;

    @Column(name = "currency")
    private String currency;

    @Column(name = "createdAt")
    private String createdAt;

    public Account() {
    }

    public Account(int accountUid, String description, String defaultCategory, String currency, String createdAt) {
        this.accountUid = accountUid;
        this.description = description;
        this.defaultCategory = defaultCategory;
        this.currency = currency;
        this.createdAt = createdAt;
    }

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
