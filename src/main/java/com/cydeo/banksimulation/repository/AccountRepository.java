package com.cydeo.banksimulation.repository;

import com.cydeo.banksimulation.dto.AccountDTO;
import com.cydeo.banksimulation.exception.RecordNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class AccountRepository {

//    public static List<AccountDTO> accountDTOList = new ArrayList<>();
//
//    public AccountDTO save(AccountDTO accountDTO) {
//        accountDTOList.add(accountDTO);
//        return accountDTO;
//
//    }
//
//    public List<AccountDTO> findAll() {
//        return accountDTOList;
//    }
//
//    public AccountDTO findById(UUID accountId) {
//        return accountDTOList.stream().filter(account -> account.getId().equals(accountId)).findAny().orElseThrow(() ->
//                new RecordNotFoundException("This account is not in the database"));
//    }
//
//    public AccountDTO deleteAccount(AccountDTO accountDTO) {
//        accountDTOList.remove(findById(accountDTO.getId()));
//        accountDTOList.add(accountDTO);
//        return accountDTO;
//
//    }
}
