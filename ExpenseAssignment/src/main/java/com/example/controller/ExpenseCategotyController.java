package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.ExpenseCategory;
import com.example.model.ExpenseCategoryModel;
import com.example.service.ExpenseCategoryService;

@RestController
@RequestMapping("/api")
public class ExpenseCategotyController {

	@Autowired
	private ExpenseCategoryService expenseCategoryService;

	@PostMapping("/addCategory")
	public ExpenseCategory createExpensesCategories(@RequestBody ExpenseCategoryModel expenseCategoryDto) {
		System.out.println("Expense name" + expenseCategoryDto.getEc_name());
		return expenseCategoryService.save(expenseCategoryDto);
	}

	@GetMapping("/categories")
	public List<ExpenseCategory> getAllExpensesCategory() {
		System.out.print(expenseCategoryService.getAllExpensesCategory());
		return expenseCategoryService.getAllExpensesCategory();
	}

}
