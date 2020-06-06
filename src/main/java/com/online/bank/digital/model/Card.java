package com.online.bank.digital.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CARD")
public class Card {

    @Id
    @GeneratedValue(generator = "CARD_PK_SEQ", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CARD_PK_SEQ", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "number", nullable = false)
    private long number;

    @Column(name = "sortCode", nullable = false)
    private String sortCode;

    @Column(name = "accountNumber", nullable = false)
    private int accountNumber;

    @Column(name = "expirationDate", nullable = false)
    private Date expirationDate;

    @Column(name = "cvv2Number", nullable = false)
    private int cvv2Number;

    @Enumerated(EnumType.STRING)
    private AccountCategory category;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "fkBalance", nullable = false)
    private Balance balance;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "fkAccountLimit", nullable = false)
    private AccountLimit accountLimit;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "fkCard")
    private List<Transaction> transactions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv2Number() {
        return cvv2Number;
    }

    public void setCvv2Number(int cvv2Number) {
        this.cvv2Number = cvv2Number;
    }

    public AccountCategory getCategory() {
        return category;
    }

    public void setCategory(AccountCategory category) {
        this.category = category;
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

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
}
