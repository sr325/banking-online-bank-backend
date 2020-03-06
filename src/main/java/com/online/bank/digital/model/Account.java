package com.online.bank.digital.model;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "ACCOUNT")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "accountUid")
    private int accountUid;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "accountHolderUid")
    private AccountHolder accountHolder;

    @Column(name = "description")
    private String description;

    //e.g. savings or current or isa
    @Column(name = "category")
    private String category;

    @Column(name = "currency")
    private String currency;

    @Column(name = "createdAt")
    private String createdAt;

    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "balanceUid")
    private Balance balance;

    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "accountLimitId")
    private AccountLimit accountLimit;

    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "accountTypeUid")
    private AccountType accountType;

    public Account() {
    }

    public Account(int accountUid, String description, String category, String currency, String createdAt, Balance balance, AccountLimit accountLimit, AccountType accountType) {
        this.accountUid = accountUid;
        this.description = description;
        this.category = category;
        this.currency = currency;
        this.createdAt = createdAt;
        this.balance = balance;
        this.accountLimit = accountLimit;
        this.accountType = accountType;
    }

    public int getAccountUid() {
        return accountUid;
    }

    public void setAccountUid(int accountUid) {
        this.accountUid = accountUid;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
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

    public AccountLimit getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(AccountLimit accountLimit) {
        this.accountLimit = accountLimit;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
