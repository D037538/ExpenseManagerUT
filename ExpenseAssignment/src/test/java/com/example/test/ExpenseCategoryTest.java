package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.model.ExpenseCategory;
import com.example.model.ExpenseCategoryModel;
import com.example.repository.ExpenceCategoryRepository;
import com.example.service.ExpenseCategoryService;
@RunWith(SpringRunner.class)
@SpringBootTest
class ExpenseCategoryTest {
	@Autowired
	private ExpenseCategoryService expenseCategoryService;
	@Autowired
	ExpenseCategoryModel expenseCategoryDto;
	@MockBean
	private ExpenceCategoryRepository expenceCategoryRepository;

	/*
	 * @Test public void testCategorySave() { ExpenseCategory ec1 = new
	 * ExpenseCategory(); ec1.setEc_id(27); ec1.setEc_name("InternerExpenses");
	 * System.out.println(ec1);
	 * Mockito.when(expenceCategoryRepository.save(ec1)).thenReturn(ec1);
	 * assertThat(expenseCategoryService.save(expenseCategoryDto)).isEqualTo(ec1);
	 * 
	 * }
	 */

	 @Test
	 public void testGetAllCategories() {
		 ExpenseCategory ec1 = new ExpenseCategory();
			ec1.setEc_id(1);
			ec1.setEc_name("food");
	
			 ExpenseCategory ec2 = new ExpenseCategory();
				ec2.setEc_id(27);
				ec2.setEc_name("InternerExpenses");
				
				List<ExpenseCategory> categoryList=new ArrayList<>();
				categoryList.add(ec1);
				categoryList.add(ec2);
				Mockito.when(expenceCategoryRepository.findAll()).thenReturn(categoryList);
				assertThat(expenseCategoryService.getAllExpensesCategory()).isEqualTo(categoryList);

	 }
}
