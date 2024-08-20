package com.nesan.EmployeeManagementSystem5;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	List<Employee> findByName(String name);
	List<Employee> findByEmail(String email);
	List<Employee> findByDepartmentId(Long departmentId);
	List<Employee> findByEmailContaining(String emailPart);
	@Query(name = "Employee.findByNameAndDepartment")
    List<Employee> findByNameAndDepartment(String name, String departmentName);
}
