package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_Office")
public class Employee {
	
	 @Id	
	 @Column
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;

	  @Column
	  private String name;

	  @Column
	  private String email;

	  @Column
	  private String designation;

	 public Integer getId() 
	 {
		 return id;
	 }

	 public void setId(Integer id) 
	 {
		 this.id = id;
	 }

	 public String getName() 
	 {
		 return name;
	 }

	 public void setName(String name) 
	 {
		 this.name = name;
	 }

	 public String getEmail() 
	 {	
		 return email;
	 }

	 public void setEmail(String email) 
	 {
		 this.email = email;
	 }

	 public String getDesignation() 
	 {
		 return designation;
	 }

	 public void setDesignation(String designation) 
	 {
		 this.designation = designation;
	 }

	 @Override
		public String toString() 
		{
			return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
		}

}
