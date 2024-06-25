package com.acc.lkm.dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

import com.acc.lkm.entity.EmployeeEntity;

/*public interface EmployeeDAO extends CrudRepository<EmployeeEntity, Integer> {
	
}*/

@RepositoryDefinition(idClass=Integer.class,domainClass=EmployeeEntity.class)
@Transactional(value="txManager")//name of the tx Manager
public interface EmployeeDAO{
	EmployeeEntity save(EmployeeEntity employeeEntity);
	Iterable<EmployeeEntity>findAll();
}
