package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "expensescategory")
public class ExpenseCategory {
	/*
	 * public ExpenseCategory( int id, String name) { ec_id=id; ec_name=name; }
	 */	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
