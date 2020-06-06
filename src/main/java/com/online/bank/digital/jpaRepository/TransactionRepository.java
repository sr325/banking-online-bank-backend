package com.online.bank.digital.jpaRepository;

import com.online.bank.digital.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

    //List<Transaction> saveOrUpdateTransaction()
}
