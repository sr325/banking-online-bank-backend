package com.online.bank.digital.model;

import javax.persistence.*;

@Entity
@Table(name = "BALANCE")
public class Balance {
    @Id @GeneratedValue
    @Column(name = "balanceUid")
    private int balanceUid;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "accountUid")
    private Account account;

    @Column(name = "currentAmount")
    private int amount;

    @Column(name = "savingAmount")
    private int savingAmount;

    @Column(name = "pendingTransactions")
    private int pendingTransactions;

    public Balance(int balanceUid, Account account, int amount, int savingAmount, int pendingTransactions) {
        this.balanceUid = balanceUid;
        this.account = account;
        this.amount = amount;
        this.savingAmount = savingAmount;
        this.pendingTransactions = pendingTransactions;
    }

    public int getBalanceUid() {
        return balanceUid;
    }

    public void setBalanceUid(int balanceUid) {
        this.balanceUid = balanceUid;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSavingAmount() {
        return savingAmount;
    }

    public void setSavingAmount(int savingAmount) {
        this.savingAmount = savingAmount;
    }

    public int getPendingTransactions() {
        return pendingTransactions;
    }

    public void setPendingTransactions(int pendingTransactions) {
        this.pendingTransactions = pendingTransactions;
    }
}
