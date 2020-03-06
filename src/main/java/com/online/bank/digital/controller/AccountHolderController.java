package com.online.bank.digital.controller;

import com.online.bank.digital.model.AccountHolder;
import com.online.bank.digital.repository.IAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AccountHolderController {
    private static Logger LOG = LoggerFactory.getLogger(AccountHolderController.class);

    @Autowired
    private IAccount accountDAO;

    @PostMapping(value = "/saveOrUpdateAccountHolder", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public AccountHolder accountHolder(@RequestBody AccountHolder accountHolder) throws Exception {
        LOG.info(accountHolder.getFirstName());
        return accountDAO.saveOrUpdateAccountHolder(accountHolder);
    }
}
