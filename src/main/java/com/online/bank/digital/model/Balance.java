package com.online.bank.digital.model;

import javax.persistence.*;

@Entity
@Table(name = "BALANCE")
public class Balance {
    @Id
    @GeneratedValue(generator = "BALANCE_PK_SEQ", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "BALANCE_PK_SEQ", allocationSize = 1)
    @Column(name = "balanceUid")
    private int balanceUid;

    @Column(name = "balance", nullable = false)
    private float balance;

    public int getBalanceUid() {
        return balanceUid;
    }

    public void setBalanceUid(int balanceUid) {
        this.balanceUid = balanceUid;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
