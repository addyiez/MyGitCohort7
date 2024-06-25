package com.acc.lkm.UiTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPQLDemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		//Query query=entityManager.createQuery("UPDATE EmpEntity SET DEPT='SAP',emp_location='Bangalore' where eid=2");//x is alias for EmpEntity
		Query query=entityManager.createNamedQuery("Update");
		query.executeUpdate();
		System.out.println("Updated");
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();

	}

}
