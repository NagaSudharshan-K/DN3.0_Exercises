package com.nesan.EmployeeManagementSystem3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	List<Employee> findByName(String name);
	List<Employee> findByEmail(String email);
	List<Employee> findByDepartmentId(Long departmentId);
}
