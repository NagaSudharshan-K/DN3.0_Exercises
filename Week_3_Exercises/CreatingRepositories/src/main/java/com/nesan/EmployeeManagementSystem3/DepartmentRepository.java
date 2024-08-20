package com.nesan.EmployeeManagementSystem3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	List<Department> findByName(String name);
}
