package com.team4.luma.entity;
import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="employee_master")
public class EmployeeMasterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
    private String employee_id;
	
	@Column(name = "employee_name")
    private String employee_name;

	@Column(name = "designation")
    private String designation;

	@Column(name = "department")
    private String department;
	
	@Column(name = "gender")
    private Character gender;
	
	@Column(name = "date_of_birth")
    private Date date_of_birth;
	
	@Column(name = "date_of_joining")
    private Date date_of_joining;
}
