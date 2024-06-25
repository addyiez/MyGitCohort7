package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.accenture.lkm.businessbean.CustomerBean;
import com.accenture.lkm.entity.CustomerEntity;
import com.accenture.lkm.utility.JPAUtility;

public class CustomerDAOIMPL implements CustomerDAO {

	
	
	public Integer addCustomer(CustomerBean customer) throws Exception {
		// TODO Auto-generated method stub
		Integer customerID = 0;
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			CustomerEntity customerEntity=new CustomerEntity();
			customerEntity.setCustomerName(customer.getCustomerName());
			customerEntity.setPurchaseDate(customer.getPurchaseDate());
			customerEntity.setBill(customer.getBill());
			
			EntityTransaction transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(customerEntity);
			transaction.commit();
			
			customerID= customerEntity.getCustomerId();
			
		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return customerID;
	}

	
	@Override
	public List<CustomerBean> getCustomerDetails() throws Exception{
		List<CustomerBean> listCustomer = new ArrayList<CustomerBean>();
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			Query query= entityManager.createQuery("SELECT c FROM CustomerEntity c");
			List<CustomerEntity> customerList=query.getResultList();
			for(CustomerEntity c : customerList){
				CustomerBean bean=new CustomerBean();
				bean.setCustomerId(c.getCustomerId());
				bean.setCustomerName(c.getCustomerName());
				bean.setBill(c.getBill());
				bean.setPurchaseDate(c.getPurchaseDate());
				listCustomer.add(bean);
			}
			
			
		} catch (Exception exception) {

			throw exception;
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}

		return listCustomer;
	}

	

}
