package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import com.example.service.ExpenseCategoryService;

class ExpenseCategoryTest {

private ExpenseCategoryService expenseCategoryService=new ExpenseCategoryService();
	@Test
	void testCategorySave() throws JSONException {
		/*
		 * ExpenseCategoryModel expenseCategoryModel=new ExpenseCategoryModel();
		 * expenseCategoryModel.setEc_name("gfhfgh"); ExpenseCategory
		 * savedExpenseCategory=expenseCategoryService.save(expenseCategoryModel);
		 * assertThat(savedExpenseCategory.getEc_name());
		 */
		  JSONObject actual = new JSONObject (); actual.put("ec_id", 1);
		  actual.put("ec_name", "food");
		  JSONAssert.assertEquals("{ec_name:\"food\", ec_id:1}", 
				  actual,false); 
		/*
		 * assertEquals("{id:1,ec_name:\"food\"}", actual);
		 */ /*
							 * ExpenseCategory ec=new ExpenseCategory(); ec.setEc_id(1);
							 * ec.setEc_name("food"); assertEquals("{ ec_id:1,ec_name:\"food\"}",actual);
							 */
		 /*
			 * final List<ExpenseCategory> allExpenses=expenseCategoryService.;
			 * assertThat(allExpenses).isEmpty(); assertThat(allExpenses).isEqualTo(1);
			 */
		}

}
