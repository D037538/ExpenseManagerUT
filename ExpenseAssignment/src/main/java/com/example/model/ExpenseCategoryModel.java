package com.example.model;

import org.springframework.stereotype.Component;

@Component
public class ExpenseCategoryModel {
		
		private int ec_id;
	    private String ec_name;
	    
		public int getEc_id() {
			return ec_id;
		}
		public void setEc_id(int ec_id) {
			this.ec_id = ec_id;
		}
		public String getEc_name() {
			return ec_name;
		}
		public void setEc_name(String ec_name) {
			this.ec_name = ec_name;
		}
}
