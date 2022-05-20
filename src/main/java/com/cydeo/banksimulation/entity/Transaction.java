package com.cydeo.banksimulation.entity;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;


public class Transaction {

    private Long id;

    private Account sender;

    private Account receiver;
    private BigDecimal amount;
    private String message;

    private Date creationDate;

}
