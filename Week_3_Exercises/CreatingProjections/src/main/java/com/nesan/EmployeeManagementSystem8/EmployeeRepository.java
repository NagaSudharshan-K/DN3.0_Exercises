package com.nesan.EmployeeManagementSystem8;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>,PagingAndSortingRepository<Employee,Long>{
	List<Employee> findByName(String name);
	List<Employee> findByName(String name,Pageable pageable);
	List<Employee> findByEmail(String email);
	List<Employee> findByDepartmentId(Long departmentId);
	List<Employee> findByEmailContaining(String emailPart);
	@Query(name = "Employee.findByNameAndDepartment")
    List<Employee> findByNameAndDepartment(String name, String departmentName,Pageable pageable);
	List<Employee> findAll(Pageable pageable);
	
List<EmployeeProjection> findAllProjectedBy();
    
    @Query("SELECT new com.example.EmployeeManagementSystem.dto.EmployeeDTO(e.id, e.name, e.email, e.department.name) FROM Employee e")
    List<EmployeeDTO> findAllEmployeeDTOs();
}
