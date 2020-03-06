package com.online.bank.digital.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT_LIMIT")
@Data
public class AccountLimit {
    @Id @GeneratedValue
    @Column(name = "accountLimitId")
    private int accountLimitId;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "accountUid")
    private Account account;

    @Column(name = "overdraftLimit")
    private int overdraftLimit;

    @Column(name = "withdrawLimit")
    private int withdrawLimit;

    public AccountLimit(int accountLimitId, Account account, int overdraftLimit, int withdrawLimit) {
        this.accountLimitId = accountLimitId;
        this.account = account;
        this.overdraftLimit = overdraftLimit;
        this.withdrawLimit = withdrawLimit;
    }

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
