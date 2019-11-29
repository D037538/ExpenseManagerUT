package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.ExpenseCategory;
import com.example.model.ExpenseCategoryModel;
import com.example.repository.ExpenceCategoryRepository;

@Service
public class ExpenseCategoryService {
	@Autowired
	private ExpenceCategoryRepository expenceCategoryRepository;

	@Autowired
	private ExpenseCategoryModel expenseCategoryDto;

	public ExpenseCategory save(ExpenseCategoryModel expenseCategoryDto) {
		ExpenseCategory ec = new ExpenseCategory();
		ec.setEc_id(expenseCategoryDto.getEc_id());
		ec.setEc_name(expenseCategoryDto.getEc_name());
		expenceCategoryRepository.save(ec);
		return ec;
	}

	public List<ExpenseCategory> getAllExpensesCategory() {
		return expenceCategoryRepository.findAll();
	}
}
