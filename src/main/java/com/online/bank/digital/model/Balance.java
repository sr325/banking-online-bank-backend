package com.online.bank.digital.model;

import javax.persistence.*;

@Entity
@Table(name = "BALANCE")
public class Balance {
    @Id
    @GeneratedValue(generator = "BALANCE_PK_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "balanceUid")
    private int balanceUid;

    @Column(name = "currentAmount", nullable = false)
    private double currentAmount;

    @Column(name = "pendingTransactions", nullable = false)
    private double pendingTransactions;

    public int getBalanceUid() {
        return balanceUid;
    }

    public void setBalanceUid(int balanceUid) {
        this.balanceUid = balanceUid;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public double getPendingTransactions() {
        return pendingTransactions;
    }

    public void setPendingTransactions(double pendingTransactions) {
        this.pendingTransactions = pendingTransactions;
    }
}
