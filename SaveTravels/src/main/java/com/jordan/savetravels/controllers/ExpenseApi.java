package com.jordan.savetravels.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jordan.savetravels.ExpenseService;
import com.jordan.savetravels.models.Expense;

@RestController
public class ExpenseApi {
    private final ExpenseService expenseService;
    public ExpenseApi(ExpenseService expenseService){
        this.expenseService = expenseService;
    }
    @RequestMapping("/api/expenses")
    public List<Expense> index() {
        return expenseService.allExpenses();
    }
    
    @RequestMapping(value="/api/expenses", method=RequestMethod.POST)
    public Expense create(
    		@RequestParam(value="expense") String expense, 
    		@RequestParam(value="vendor") String vendor, 
    		@RequestParam(value="description") String description, 
    		@RequestParam(value="amount") Double amount
    	) {
        Expense newExpense = new Expense(expense, vendor, description, amount);
        return expenseService.createExpense(newExpense);
    }
    
    @RequestMapping("/api/expenses/{id}")
    public Expense show(@PathVariable("id") Long id) {
        Expense expense = expenseService.findExpense(id);
        return expense;
    }
}