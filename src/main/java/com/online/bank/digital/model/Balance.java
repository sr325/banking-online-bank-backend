package com.online.bank.digital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BALANCE")
public class Balance {
    @Id
    @Column(name = "balanceUid")
    private int balanceUid;

    @Column(name = "currentAmount")
    private int amount;

    @Column(name = "savingAmount")
    private int savingAmount;

    @Column(name = "currentOverdraft")
    private int currentOverdraft;

    @Column(name = "pendingTransactions")
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

    public int getCurrentOverdraft() {
        return currentOverdraft;
    }

    public void setCurrentOverdraft(int currentOverdraft) {
        this.currentOverdraft = currentOverdraft;
    }

    public int getPendingTransactions() {
        return pendingTransactions;
    }

    public void setPendingTransactions(int pendingTransactions) {
        this.pendingTransactions = pendingTransactions;
    }
}
