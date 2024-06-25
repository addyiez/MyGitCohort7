package com.acc.lkm.UiController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.lkm.EmpEntity.EmpEntity; // Import the EmpEntity class

public class UiUpdate {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Create
        entityManager.getTransaction().begin();
        EmpEntity emp = new EmpEntity();
        emp.setEmpId(1);
        emp.setEmpName("Ajit Narayan");
        emp.setRole("Sr.Analyst");
        emp.setSalary(80000.0);
        //entityManager.persist(emp);
        entityManager.merge(emp);
        entityManager.getTransaction().commit();
        System.out.println("Employee added. ID: " + emp.getEmpId());

        // Read
        EmpEntity retrievedEmp = entityManager.find(EmpEntity.class, emp.getEmpId());
        System.out.println("Retrieved Employee: " + retrievedEmp.getEmpName());

        // Update
        entityManager.getTransaction().begin();
        retrievedEmp.setSalary(60000.0);
        entityManager.getTransaction().commit();
        System.out.println("Employee salary updated.");

        // Delete
        entityManager.getTransaction().begin();
        entityManager.remove(retrievedEmp);
        entityManager.getTransaction().commit();
        System.out.println("Employee deleted.");

        // Close the EntityManager
        entityManager.close();
        entityManagerFactory.close();
    }
}
