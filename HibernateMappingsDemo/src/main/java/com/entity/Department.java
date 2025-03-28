package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long departmentId; 
	
	public long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Column(name = "department_name")
	private String departmentName; 
	
}
