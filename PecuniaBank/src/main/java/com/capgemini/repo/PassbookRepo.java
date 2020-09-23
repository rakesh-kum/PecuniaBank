package com.capgemini.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.model.Transaction;

public interface PassbookRepo extends JpaRepository<Transaction, Long>{

}