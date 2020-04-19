package com.online.bank.digital.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT_LIMIT")
@Data
public class AccountLimit {
    @Id
    @GeneratedValue(generator = "ACCOUNT_LIMIT_PK_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "accountLimitId", nullable = false)
    private int accountLimitId;

    @Column(name = "overdraftLimit", nullable = false)
    private int overdraftLimit;

    @Column(name = "withdrawLimit", nullable = false)
    private int withdrawLimit;

    public int getAccountLimitId() {
        return accountLimitId;
    }

    public void setAccountLimitId(int accountLimitId) {
        this.accountLimitId = accountLimitId;
    }

    public int getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public int getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(int withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }


}
