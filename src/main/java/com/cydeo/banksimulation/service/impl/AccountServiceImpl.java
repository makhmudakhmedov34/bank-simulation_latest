package com.cydeo.banksimulation.service.impl;

import com.cydeo.banksimulation.entity.Account;
import com.cydeo.banksimulation.enums.AccountStatus;
import com.cydeo.banksimulation.dto.AccountDTO;
import com.cydeo.banksimulation.enums.AccountType;
import com.cydeo.banksimulation.mapper.AccountMapper;
import com.cydeo.banksimulation.repository.AccountRepository;
import com.cydeo.banksimulation.service.AccountService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
public class AccountServiceImpl implements AccountService {

    AccountRepository accountRepository;

    AccountMapper accountMapper;


    public AccountServiceImpl(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public void createNewAccount(AccountDTO accountDTO) {

        accountDTO.setCreationDate(new Date());
        accountDTO.setAccountStatus(AccountStatus.ACTIVE);
         accountRepository.save(accountMapper.convertToEntity(accountDTO));
    }

    @Override
    public List<AccountDTO> listAllAccount() {

        List<Account> accountList = accountRepository.findAll();
        return accountList.stream().map(accountMapper::convertToDTO).collect(Collectors.toList());

    }

    @Override
    public void deleteAccount(Long accountId) {
       Account account = accountRepository.getById(accountId);
       account.setAccountStatus(AccountStatus.DELETED);
       accountRepository.save(account);
    }

    @Override
    public AccountDTO retrieveById(Long account) {
        return accountMapper.convertToDTO(accountRepository.getById(account));
    }

    @Override
    public List<AccountDTO> listAllActiveAccount() {
        List<Account> accountList = accountRepository.findAllByAccountStatus(AccountStatus.ACTIVE);
      return  accountList.stream().map(accountMapper::convertToDTO).collect(Collectors.toList());

    }
}
