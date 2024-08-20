package com.nesan.EmployeeManagementSystem5;

import org.hibernate.annotations.ManyToAny;
import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Emp_table")
@NamedQueries({
   
    @NamedQuery(name = "Employee.findByNameAndDepartment", query = "SELECT e FROM Employee e WHERE e.name = :name AND e.department.name = :departmentName")
})
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "department_id",referencedColumnName ="id",nullable = false)
	private Department department;

	
	
}
