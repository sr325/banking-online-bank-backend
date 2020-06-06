package com.online.bank.digital.controller;

import com.online.bank.digital.model.Transaction;
import com.online.bank.digital.repository.ITransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionController {
    private static Logger LOG = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    private ITransaction transactionDAO;

    @PostMapping(value = "/saveOrUpdateTransaction", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Transaction saveOrUpdateTransaction(@RequestParam int accountId, @RequestBody Transaction transaction) {
        return transactionDAO.saveOrUpdateTransaction(accountId, transaction);
    }

    @GetMapping(value = "/getTransactions", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Transaction> getTransactions(@RequestParam int accountId){
     return transactionDAO.getAllTransactionsForAccountHolder(accountId);
    }

    @GetMapping(value = "getTransaction", produces = MediaType.APPLICATION_JSON_VALUE)
    public Transaction getTransaction (@RequestParam int transactionId){
        return transactionDAO.getTransaction(transactionId);
    }
    /*
    When A pays,
    Receive a form with card details of B
    Find B's card in the table using sortcode and account number
    If cannot find then no account is set up
    else first add transaction in transaction table,
    second debit in B account
    whilst credit in A account
     */
}
