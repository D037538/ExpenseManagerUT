package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.ExpenseModel;
import com.example.model.Expenses;
import com.example.repository.ExpensesRepository;

@Service
public class ExpenseService {
	@Autowired
	private ExpensesRepository expensesRepository;

	public Expenses save(ExpenseModel expenseModel) {
		Expenses e = new Expenses();
		e.setE_amount(expenseModel.getE_amount());
		e.setCreateDateTime(expenseModel.getCreateDateTime());
		e.setEcc_id(expenseModel.getEc_id());
		expensesRepository.save(e);

		return e;
	}

	public List<Expenses> getAllExpenses() {
		return expensesRepository.findAll();
	}
	
	  public List<Object[]> getListOfExpensesmonthWise() { // TODO Auto-generated method
	   return expensesRepository.findByMonth(); }
	 
}
