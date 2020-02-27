package com.online.bank.digital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
What type of account he has? What type of card he holds? When did he opened an account?
 */

@Entity
@Table(name = "ACCOUNT_HOLDER_TYPE")
public class AccountType {
    @Id
    @Column(name = "accountHolderTypeUid")
    private int accountHolderTypeUid;

    //fk of accountHolder
    @Column(name = "accountHolderUid")
    private int accountHolderUid;

    //individual or business
    @Column(name = "type")
    private int type;

    //basic or advanced
    @Column(name = "cardType")
    private int cardType;

    @Column(name = "registeredDate")
    private int registeredDate;

    public int getAccountHolderTypeUid() {
        return accountHolderTypeUid;
    }

    public void setAccountHolderTypeUid(int accountHolderTypeUid) {
        this.accountHolderTypeUid = accountHolderTypeUid;
    }

    public int getAccountHolderUid() {
        return accountHolderUid;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public void setAccountHolderUid(int accountHolderUid) {
        this.accountHolderUid = accountHolderUid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(int registeredDate) {
        this.registeredDate = registeredDate;
    }
}
