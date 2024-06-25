package com.acc.lkm.UiTest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDelete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPQLDemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		//Query query=entityManager.createQuery("delete from EmpEntity where eid = '1'");
		Query query=entityManager.createNamedQuery("Delete");
		query.executeUpdate();
		System.out.println("Updated");
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	

	}

}
