package com.acc.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.acc.lkm.businessbean.CompanyBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.entity.CompanyEntity;
import com.acc.lkm.entity.EmployeeEntity;
import com.acc.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO {

	@Override
	public Integer createCompanyAndEmployeeRecords(CompanyBean companyBean1,EmployeeBean employeeBean1,EmployeeBean employeeBean2) throws Exception {
		EntityManager entityManager = null;
		int employeeId = 0;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			CompanyEntity companyEntity = convertCompanyBeanToEntity(companyBean1);
			EmployeeEntity employeeEntity1 = convertEmployeeBeanToEntity(employeeBean1);
			EmployeeEntity employeeEntity2 = convertEmployeeBeanToEntity(employeeBean2);
		
			//List of Employees for the company
			List<EmployeeEntity> listOfEmployess =  new ArrayList<EmployeeEntity>();
			listOfEmployess.add(employeeEntity1);
			listOfEmployess.add(employeeEntity2);
			
			//Company has List of Employees
			companyEntity.setEmployees(listOfEmployess);
			
			//Persisting company will persist the related employees
			// due to cascade type all
			entityManager.getTransaction().begin();
				entityManager.persist(companyEntity);
			entityManager.getTransaction().commit();
			
		} catch (Exception exception) {
			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
		return employeeId;
	}
	
	
	
	public static CompanyEntity convertCompanyBeanToEntity(CompanyBean companyBean) {
		CompanyEntity companyEntity = new CompanyEntity();
		companyEntity.setCompanyName(companyBean.getCompanyName());
		return companyEntity;
	}

	public static EmployeeEntity convertEmployeeBeanToEntity(EmployeeBean employeeBean) {
		EmployeeEntity e1 = new EmployeeEntity();
		e1.setEmployeeName(employeeBean.getEmployeeName());
		e1.setRole(employeeBean.getRole());
		return e1;

	}
}


