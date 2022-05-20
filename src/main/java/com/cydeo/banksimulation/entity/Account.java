package com.cydeo.banksimulation.entity;


import com.cydeo.banksimulation.enums.AccountStatus;
import com.cydeo.banksimulation.enums.AccountType;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;


public class Account {



    private Long id;

    private AccountType accountType;

    private AccountStatus accountStatus;

    private Date creationDate;
    private Long userId;
    private BigDecimal balance;







}
