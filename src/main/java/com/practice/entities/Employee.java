package com.practice.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employees")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	@Column(name="emp_no")
	@Id
	@GeneratedValue
	private Integer empNo;
	
	@Column(name="birth_date")
	private Date birthDate;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="hire_date")
	private Date hireDate;
	
	 
}
