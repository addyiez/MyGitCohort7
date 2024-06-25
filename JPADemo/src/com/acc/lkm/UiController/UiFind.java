package com.acc.lkm.UiController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.lkm.EmpEntity.EmpEntity;

public class UiFind {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EmpEntity emp=entityManager.find(EmpEntity.class,1);
		if(emp!=null) {
			System.out.println("Employee ID is:"+emp.getEmpId()+"\n"+
		        "Employee Name is:"+emp.getEmpName()+"\n"+
					"Employee Role is:"+emp.getRole()+"\n"+
		        "Employee Salary is:"+emp.getSalary());
			
		}
		else {
			System.out.println("Employee is not found");
		}
		entityManager.close();
		entityManagerFactory.close();
		

	}

}
