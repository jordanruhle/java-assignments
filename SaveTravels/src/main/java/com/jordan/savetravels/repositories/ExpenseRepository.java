package com.jordan.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jordan.savetravels.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{
    // 	FIND ALL
    List<Expense> findAll();
    // FIND BY DESCRIPTION
    List<Expense> findByDescriptionContaining(String search);
    // this method counts how many Expenses contain a certain string
    Long countByExpenseContaining(String search);
    // this method deletes an expense that starts with a specific title
    Long deleteByExpenseStartingWith(String search);
}