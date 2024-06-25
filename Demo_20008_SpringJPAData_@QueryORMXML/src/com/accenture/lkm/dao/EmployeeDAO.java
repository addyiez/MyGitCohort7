package com.accenture.lkm.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.entity.EmployeeEntity;


@SuppressWarnings("rawtypes")

@RepositoryDefinition(idClass = Integer.class, domainClass = EmployeeEntity.class)
@Transactional(value = "txManager")
// name of TransactionManger can be any thing
public interface EmployeeDAO {
	@Query(name="EMP.query1_getAllEmployeesStringFunctions")
	List stringFunctions(); 
	
	@Query(name="EMP.query3_getAverageSalaryForEmployeesByRole") 
	List groupByExampleNamed();
	
	@Query("SELECT e FROM EmployeeEntity e WHERE e.insertTime BETWEEN :startDate AND :endDate")
	List<EmployeeEntity> getEmployeeDetailsWithin(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
	
	@Modifying
	@Query("UPDATE EmployeeEntity e SET e.salary = :salary WHERE e.role = :role")
	Integer updateEmployeeSalaryWithRole(@Param("role") String role, @Param("salary") Double salary);

	@Modifying
	@Query("DELETE FROM EmployeeEntity e WHERE e.name = :name")
	Integer deleteEmployeeByName(@Param("name") String name);
}
// if @query is not having a valid query then 
// then method signature is checked for the query method
// query translation 
	