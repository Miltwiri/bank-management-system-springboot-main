package com.alien.bank.management.system.repository;

import com.alien.bank.management.system.entity.Transaction;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Existing methods...
    @Query("SELECT t FROM Transaction t WHERE t.account.user.email = :email")
    List<Transaction> findByAccountOwner(@Param("email") String email);
}
