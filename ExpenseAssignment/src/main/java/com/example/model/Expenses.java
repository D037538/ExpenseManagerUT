package com.example.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "expenses")
public class Expenses {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int e_id;
	    private String e_amount;
	    @CreationTimestamp
	    private LocalDateTime createDateTime;
	    @UpdateTimestamp
	    private LocalDateTime updateDateTime;
	    
	    @ManyToOne
	    @JoinColumn(name="ec_id")
	    private ExpenseCategory expenseCategory;
		private int ecc_id;
		
		public int getEcc_id() {
			return ecc_id;
		}
		public void setEcc_id(int ecc_id) {
			this.ecc_id = ecc_id;
		}
		public int getE_id() {
			return e_id;
		}
		public void setE_id(int e_id) {
			this.e_id = e_id;
		}
		public String getE_amount() {
			return e_amount;
		}
		public void setE_amount(String e_amount) {
			this.e_amount = e_amount;
		}
		public LocalDateTime getCreateDateTime() {
			return createDateTime;
		}
		public void setCreateDateTime(LocalDateTime createDateTime) {
			this.createDateTime = createDateTime;
		}
		public LocalDateTime getUpdateDateTime() {
			return updateDateTime;
		}
		public void setUpdateDateTime(LocalDateTime updateDateTime) {
			this.updateDateTime = updateDateTime;
		}
		public ExpenseCategory getExpenseCategory() {
			return expenseCategory;
		}
		public void setExpenseCategory(ExpenseCategory expenseCategory) {
			this.expenseCategory = expenseCategory;
		}

	   


}
