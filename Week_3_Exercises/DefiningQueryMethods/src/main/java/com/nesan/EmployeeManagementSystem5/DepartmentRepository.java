package com.nesan.EmployeeManagementSystem5;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	@Query("SELECT d FROM Department d WHERE d.id = :id")
	List<Department> findByIdeo(Long id);
	
}
