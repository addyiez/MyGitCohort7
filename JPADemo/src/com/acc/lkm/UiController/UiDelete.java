package com.acc.lkm.UiController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.lkm.EmpEntity.EmpEntity; // Import the EmpEntity class

public class UiDelete {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPADemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Specify the ID of the entity you want to delete
        Integer entityIdToDelete = 1; 
        // Find the entity by its ID
        EmpEntity entityToDelete = entityManager.find(EmpEntity.class, entityIdToDelete);

        if (entityToDelete != null) { // Check if the entity exists
            // Begin a transaction
            entityManager.getTransaction().begin();

            // Remove the entity
            entityManager.remove(entityToDelete);

            // Commit the transaction
            entityManager.getTransaction().commit();

            System.out.println("Entity with ID " + entityIdToDelete + " deleted successfully.");
        } else {
            System.out.println("Entity with ID " + entityIdToDelete + " not found.");
        }

        // Close the EntityManager
        entityManager.close();
        entityManagerFactory.close();
    }
}
