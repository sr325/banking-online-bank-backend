package com.online.bank.digital.model;

import javax.persistence.*;

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

    @Column(name = "balanceUid")
    private Balance balance;

    @Column(name = "accountLimits")
    private AccountLimits accountLimits;

    @Column(name = "accountType")
    private AccountType accountType;

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

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public AccountLimits getAccountLimits() {
        return accountLimits;
    }

    public void setAccountLimits(AccountLimits accountLimits) {
        this.accountLimits = accountLimits;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
