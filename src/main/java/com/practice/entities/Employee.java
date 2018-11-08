package com.practice.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="employees")
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
	private Gender gender;
	
	@Column(name="hire_date")
	private Date hireDate;
	
	public enum Gender{
		M,F
	}
}
