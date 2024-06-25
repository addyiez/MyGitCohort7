package com.shop.utility;

import javax.persistence.*;

public class JPAUtility {
    private static EntityManagerFactory entityManagerFactory;

    private static EntityManagerFactory buildEntityManagerFactory() {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("ShopPersistenceUnit");
            return entityManagerFactory;
        } catch (Throwable ex) {
            System.err.println("Initialization of EntityManagerFactory failed." + ex);
            throw new RuntimeException(ex);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            entityManagerFactory = buildEntityManagerFactory();
        }
        return entityManagerFactory;
    }

    public static void closeEntityManagerFactory() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
