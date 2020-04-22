package com.online.bank.digital.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
@Data
public class Account {
    @Id
    @GeneratedValue(generator = "ACCOUNT_PK_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "accountUid")
    private int accountUid;

    @Column(name = "description", nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    private AccountCategory category;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "createdAt", nullable = false)
    private String createdAt;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "fkBalance")
    private Balance balance;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "fkAccountLimit")
    private AccountLimit accountLimit;

    public int getAccountUid() {
        return accountUid;
    }

    public void setAccountUid(int accountUid) {
        this.accountUid = accountUid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AccountCategory getCategory() {
        return category;
    }

    public void setCategory(AccountCategory category) {
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
}
