package com.online.bank.digital.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "BALANCE")
public class Balance {
    @Id
    @GeneratedValue(generator = "BALANCE_PK_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "balanceUid")
    private int balanceUid;

    @Column(name = "currentAmount", nullable = false)
    private int amount;

    @Column(name = "savingAmount", nullable = false)
    private int savingAmount;

    @Column(name = "pendingTransactions", nullable = false)
    private int pendingTransactions;

    public int getBalanceUid() {
        return balanceUid;
    }

    public void setBalanceUid(int balanceUid) {
        this.balanceUid = balanceUid;
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
