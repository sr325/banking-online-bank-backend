package com.online.bank.digital.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT_LIMIT")
@Data
public class AccountLimit {
    @Id
    @GeneratedValue(generator = "ACCOUNT_LIMIT_PK_SEQ", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "ACCOUNT_LIMIT_PK_SEQ", allocationSize = 1)
    @Column(name = "accountLimitId")
    private int accountLimitId;

    @Column(name = "overdraftLimit", nullable = false)
    private double overdraftLimit;

    @Column(name = "withdrawLimit", nullable = false)
    private double withdrawLimit;

    public int getAccountLimitId() {
        return accountLimitId;
    }

    public void setAccountLimitId(int accountLimitId) {
        this.accountLimitId = accountLimitId;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
