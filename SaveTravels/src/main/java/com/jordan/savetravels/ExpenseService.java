package com.jordan.savetravels;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jordan.savetravels.models.Expense;
import com.jordan.savetravels.repositories.ExpenseRepository;
@Service
public class ExpenseService {
	
    // adding the expense repository as a dependency
    private final ExpenseRepository expenseRepository;
    
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    // returns all the expenses
    public List<Expense> allExpenses() {
        return expenseRepository.findAll();
    }
    // creates an expense
    public Expense createExpense(Expense b) {
        return expenseRepository.save(b);
    }
    // retrieves an expense
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = expenseRepository.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
	// DELETE A USER
	public void deleteExpense(Long id) {
		expenseRepository.deleteById(id);
	}
}