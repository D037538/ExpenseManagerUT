package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Expenses;

@Repository
public interface ExpensesRepository extends JpaRepository<Expenses, Long> {

}
