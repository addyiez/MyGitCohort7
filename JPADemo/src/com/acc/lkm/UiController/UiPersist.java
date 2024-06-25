package com.acc.lkm.UiController;
import javax.persistence.*;
 
import com.acc.lkm.EmpEntity.EmpEntity;
public class UiPersist {
 
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("JPADemo");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EmpEntity emp=new EmpEntity();
		emp.setEmpId(1);
		emp.setEmpName("Rahul Kashyap");
		emp.setRole("Sr.Analyst");
		emp.setSalary(75000.00);
		entityManager.getTransaction().begin();
		//entityManager.persist(emp);
		entityManager.merge(emp);
		entityManager.getTransaction().commit();
		System.out.println("Employee Registered Successfully");
		entityManager.close();
		entityManagerFactory.close();
 
 
	}
 
}

