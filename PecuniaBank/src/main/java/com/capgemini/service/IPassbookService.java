package com.capgemini.service;

import java.util.List;

import com.capgemini.model.BankAccountDetails;
import com.capgemini.model.Transaction;

public interface IPassbookService {
List<Transaction> getAllTransactions();

Transaction getTransactionByTransactionId(int transactionId);

List<Transaction> getTrasactionByAccountNumber(long accNumber);

void save(BankAccountDetails ba);

}