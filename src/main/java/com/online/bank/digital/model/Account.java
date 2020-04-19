package com.online.bank.digital.model;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

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

    //e.g. savings or current or isa
    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "createdAt", nullable = false)
    private String createdAt;

    @OneToOne(fetch = FetchType.LAZY, cascade={CascadeType.ALL})
    @JoinColumn(name = "fkBalance", nullable = false)
    private Balance balance;

    @OneToOne(fetch = FetchType.LAZY, cascade={CascadeType.ALL})
    @JoinColumn(name = "fkAccountLimit", nullable = false)
    private AccountLimit accountLimit;

    @OneToOne(fetch = FetchType.LAZY, cascade={CascadeType.ALL})
    @JoinColumn(name = "fkAccountType", nullable = false)
    private AccountType accountType;

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
