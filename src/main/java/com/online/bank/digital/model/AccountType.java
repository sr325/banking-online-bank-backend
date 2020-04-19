package com.online.bank.digital.model;

import lombok.Data;

import javax.persistence.*;

/*
What type of account he has? What type of card he holds? When did he opened an account?
 */


@Entity
@Table(name = "ACCOUNT_TYPE")
@Data
public class AccountType {
    @Id
    @GeneratedValue(generator = "ACCOUNT_TYPE_PK_SEQ", strategy = GenerationType.SEQUENCE)
    @Column(name = "accountTypeUid")
    private int accountTypeUid;

    //individual or business
    @Column(name = "type", nullable = false)
    private String type;

    //basic or advanced
    @Column(name = "cardType", nullable = false)
    private String cardType;

    @Column(name = "registeredDate", nullable = false)
    private String registeredDate;

    public int getAccountTypeUid() {
        return accountTypeUid;
    }

    public void setAccountTypeUid(int accountTypeUid) {
        this.accountTypeUid = accountTypeUid;
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
