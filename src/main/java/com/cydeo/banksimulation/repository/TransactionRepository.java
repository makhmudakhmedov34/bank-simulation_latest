package com.cydeo.banksimulation.repository;

import com.cydeo.banksimulation.dto.TransactionDTO;
import com.cydeo.banksimulation.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

    @Query(value = "SELECT * FROM transactions ORDER BY  creation_date ASC LIMIT 10",nativeQuery = true)
 List<Transaction> findLastTenTransaction();

    @Query("SELECT t FROM Transaction t where t.receiver.id = ?1 or t.receiver.id = ?1")
    List<TransactionDTO> findTransactionListById(Long id);
//    public List<TransactionDTO> findTransactionListById(UUID id) {
//        return transactionDTOList.stream().filter(transactionDTO -> transactionDTO.getSender().equals(id) || transactionDTO.getReceiver().equals(id))
//                .collect(Collectors.toList());
//    }
}
