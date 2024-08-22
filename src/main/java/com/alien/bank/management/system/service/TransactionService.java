package com.alien.bank.management.system.service;

import java.util.List;

import com.alien.bank.management.system.model.transaction.DepositRequestModel;
import com.alien.bank.management.system.model.transaction.TransactionResponseModel;
import com.alien.bank.management.system.model.transaction.TransferRequestModel;
import com.alien.bank.management.system.model.transaction.WithdrawRequestModel;



public interface TransactionService {
    TransactionResponseModel deposit(DepositRequestModel request);
    TransactionResponseModel withdraw(WithdrawRequestModel request);
    TransactionResponseModel transfer(TransferRequestModel request);

    List<TransactionResponseModel> getAllTransactions();

    List<TransactionResponseModel> getUserTransactions(String email);
}