package com.jordan.savetravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jordan.savetravels.ExpenseService;
import com.jordan.savetravels.models.Expense;

@Controller
public class ExpenseController {
	
	// IMPORT OUR SERVICE / DEPENDENCY INJECTION
	@Autowired
	ExpenseService expenseService;
	
    @GetMapping("/expenses")
    public String index(
    		@ModelAttribute("expenseObj") Expense emptyExpenseObj,
    		Model model
    	) {
        List<Expense> expenses = expenseService.allExpenses();
        model.addAttribute("expenses", expenses);
        return "index.jsp";
    }

    // READ ONE EXPENSE
 	@GetMapping("/expenses/{id}")
 	public String showOne(
 		@PathVariable("id") Long id,
 		Model model
 	) {
 		// RETRIEVE ONE EXPENSE FROM DB
 		Expense oneExpense = expenseService.findExpense(id);

 		// PASS THE INFORMATION TO THE JSP
 		model.addAttribute("expense", oneExpense);
 	
 		return "show.jsp";
 	}
 	
 	// CREATE ONE
 	 @PostMapping("/expenses/new")
     public String create(
    		 @Valid @ModelAttribute("expenseObj") Expense fullExpenseObj, 
    		 BindingResult result,
    		 Model model
    		) {
         if (result.hasErrors()) {
        	 List<Expense> expenses = expenseService.allExpenses();
             model.addAttribute("expenses", expenses);
             return "index.jsp";
         } else {
             expenseService.createExpense(fullExpenseObj);
             return "redirect:/expenses";
         }
     }
 	 
 	 
 	 //EDIT ONE GET ROUTE
 	 @GetMapping("/expenses/{id}/edit")
 	 public String edit (
 			 @PathVariable("id") Long id,
 			 Model model
 		) {
 		 Expense expense = expenseService.findExpense(id);
 		 model.addAttribute("expenseObj", expense);
 		 return "edit.jsp";
 	 }
 	 
 	 //EDIT ONE POST ROUTE
 	 @PutMapping("/expenses/{id}/edit")
 	 public String edit (
 			@Valid @ModelAttribute("expenseObj") Expense fullExpenseObj, 
 			BindingResult result
 		) {
	 		if (result.hasErrors()) {
	            return "edit.jsp";
	        } else {
	            expenseService.createExpense(fullExpenseObj);
	            return "redirect:/expenses";
	        }
 	 }
 	 //DELETE
 	 @DeleteMapping("/expenses/{id}/delete")
 	 public String deleteExpense(
 	 	@PathVariable("id") Long id,
 	 	Model model
 	 	) {
 		 	expenseService.deleteExpense(id);
 		 	return "redirect:/expenses";
 	 }
}
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
 	 
