package com.online.bank.digital.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class AccountController {
    private static final Logger LOG = Logger.getLogger(AccountController.class.getName());

/*    @Autowired
    private IAccountRepository accountRepository;

    //Get all details of account using accountId
    @GetMapping(value = "/{account}", produces = "application/json")
    public Optional<Account> getAccount(@PathVariable final String accountId) {
        Optional<Account> account = accountRepository.findById(accountId);
        LOG.info("Account id is :{}");
        account.ifPresent(System.out::println);
        return account;
    }*/



}
