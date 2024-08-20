package com.nesan.EmployeeManagementSystem9;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	@Query("SELECT d FROM Department d WHERE d.id = :id")
	List<Department> findByIdeo(Long id);

    
List<DepartmentProjection> findAllProjectedBy();
    
    @Query("SELECT new com.example.EmployeeManagementSystem.dto.DepartmentDTO(d.id, d.name) FROM Department d")
    List<DepartmentDTO> findAllDepartmentDTOs();
}
