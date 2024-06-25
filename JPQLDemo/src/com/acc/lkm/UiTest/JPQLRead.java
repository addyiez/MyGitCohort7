package com.acc.lkm.UiTest;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.acc.lkm.entity.EmpEntity;

public class JPQLRead {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPQLDemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		//Query query=entityManager.createQuery("SELECT x from EmpEntity x");//x is alias for EmpEntity
		Query query=entityManager.createNamedQuery("fetch");
		List<EmpEntity>list=query.getResultList();//get all the entities to list
		System.out.print("Employee List");
		System.out.println();
		System.out.print("Emp ID ");
		System.out.print("Emp Name ");
		System.out.print("Location ");
		System.out.print("Department ");
		System.out.println();
		//Read/fetch the employees from list
		for(EmpEntity emp:list) {
			System.out.println(emp.getEid()+" "+emp.getEmp_name()+" "+emp.getEmp_location()+" "+emp.getDept());
		}

	}

}
