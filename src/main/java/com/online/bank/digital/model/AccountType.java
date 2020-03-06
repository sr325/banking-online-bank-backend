package com.online.bank.digital.model;

import lombok.Data;

import javax.persistence.*;

/*
What type of account he has? What type of card he holds? When did he opened an account?
 */


@Entity
@Table(name = "ACCOUNT_HOLDER_TYPE")
@Data
public class AccountType {
    @Id @GeneratedValue
    @Column(name = "accountTypeUid")
    private int accountTypeUid;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "accountUid")
    private Account account;

    //individual or business
    @Column(name = "type")
    private String type;

    //basic or advanced
    @Column(name = "cardType")
    private String cardType;

    @Column(name = "registeredDate")
    private String registeredDate;

    public AccountType(int accountTypeUid, Account account, String type, String cardType, String registeredDate) {
        this.accountTypeUid = accountTypeUid;
        this.account = account;
        this.type = type;
        this.cardType = cardType;
        this.registeredDate = registeredDate;
    }

    public int getAccountTypeUid() {
        return accountTypeUid;
    }

    public void setAccountTypeUid(int accountTypeUid) {
        this.accountTypeUid = accountTypeUid;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }
}
