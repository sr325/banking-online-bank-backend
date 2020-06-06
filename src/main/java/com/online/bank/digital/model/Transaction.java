package com.online.bank.digital.model;

import javax.persistence.*;

@Entity
@Table(name = "TRANSACTION")
public class Transaction {
    @Id
    @GeneratedValue(generator = "TRANSACTION_PK_SQ", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "TRANSACTION_PK_SQ", allocationSize = 1)
    @Column(name = "transaction_id")
    private int transaction_id;

    @Column(name = "amount")
    private float amount;

    @Enumerated(EnumType.STRING)
    private TransactionType transactionType;

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }
}
