package com.online.bank.digital.controller;

import com.online.bank.digital.model.Account;
import com.online.bank.digital.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping(value = "/{account}", produces = "application/json")
    public Optional<Account> getAccount(@PathVariable final String accountId) {
        return accountRepository.findById(accountId);
    }

}
