package com.acc.lkm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.util.SystemPropertyUtils;

import com.acc.lkm.businessbean.AssetBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.entity.AssetEntity;
import com.acc.lkm.entity.EmployeeEntity;
import com.acc.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO{

	@Override
	public void getAllEmployeesAndAssetsCascade() throws Exception {
		EntityManager entityManager=null;
		try {
			EntityManagerFactory entityManagerFactory=JPAUtility.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			Query query=entityManager.createQuery("SELECT z from EmployeeEntity z");
			//getResultSet() : Execute the SELECt query and return the query results as an untyped list
			List<EmployeeEntity>listEmployees=query.getResultList();
			//All the related Parent/Target Entity (AssetEntity) records should fetch automatically due to CASCADE_TYPE.ALL
			//Read/Fetch all the records of EmployeeEntity & AssetEntity
			for(EmployeeEntity empEntity:listEmployees) {
				AssetEntity assetEntity=empEntity.getAssetEntity();
				System.out.println("Employee :"+empEntity.getEmployeeId()+","+empEntity.getEmployeeName());
				System.out.println(" Assets :"+assetEntity.getAssetId()+","+assetEntity.getAssetName());
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
			System.out.println("Executed");
		}
		
	}

	@Override
	public void getAllEmployeesAndAssetinnerJOIN() throws Exception {
		EntityManager entityManager=null;
		try {
			EntityManagerFactory entityManagerFactory=JPAUtility.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			Query query=entityManager.createQuery("SELECT k from EmployeeEntity k INNER JOIN k.assetEntity a");
			//getResultSet() : Execute the SELECt query and return the query results as an untyped list
			List<EmployeeEntity>listEmployees=query.getResultList();
			//All the related Parent/Target Entity (AssetEntity) records should fetch automatically due to CASCADE_TYPE.ALL
			//Read/Fetch all the records of EmployeeEntity & AssetEntity
			for(EmployeeEntity empEntity:listEmployees) {
				AssetEntity assetEntity=empEntity.getAssetEntity();
				System.out.println("Employee :"+empEntity.getEmployeeId()+","+empEntity.getEmployeeName());
				System.out.println(" Assets :"+assetEntity.getAssetId()+","+assetEntity.getAssetName());
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
			System.out.println("Executed");
		}
		
	}

	@Override
	public void getEmployeeWithAssets(String assetName) throws Exception {
		EntityManager entityManager=null;
		try {
			EntityManagerFactory entityManagerFactory=JPAUtility.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			Query query=entityManager.createQuery("SELECT k from EmployeeEntity k where k.assetEntity.assetName=?1");
			query.setParameter(1,assetName);
			//we are passing param(?) for assetName value
			//We will set the value of assetName from UI
			//getResultSet() : Execute the SELECt query and return the query results as an untyped list
			List<EmployeeEntity>listEmployees=query.getResultList();
			//All the related Parent/Target Entity (AssetEntity) records should fetch automatically due to CASCADE_TYPE.ALL
			//Read/Fetch all the records of EmployeeEntity & AssetEntity
			for(EmployeeEntity empEntity:listEmployees) {
				AssetEntity assetEntity=empEntity.getAssetEntity();
				System.out.println("Employee :"+empEntity.getEmployeeId()+","+empEntity.getEmployeeName());
				System.out.println(" Assets :"+assetEntity.getAssetId()+","+assetEntity.getAssetName());
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
			System.out.println("Executed");
		}	
		
	}

	/*@Override
	public Integer insertAssetWithEmployee(EmployeeBean employeeBean, AssetBean assetBean) throws Exception {
		EntityManager entityManager=null;
		int employeeId=0;
		try {
			EntityManagerFactory entityManagerFactory=JPAUtility.getEntityManagerFactory();
			entityManager=entityManagerFactory.createEntityManager();
			AssetEntity assetEntity=new AssetEntity();
			assetEntity.setAssetName(assetBean.getAssetName());
			assetEntity.setAssetBrandName(assetBean.getAssetBrandName());
			assetEntity.setValidity(assetBean.getValidity());
			EmployeeEntity employeeEntity=new EmployeeEntity();
			employeeEntity.setEmployeeName(employeeBean.getEmployeeName());
			employeeEntity.setRole(employeeBean.getRole());
			employeeEntity.setSalary(employeeBean.getSalary());
			employeeEntity.setInsertTime(employeeBean.getInsertTime());
			employeeEntity.setAssetEntity(assetEntity);
			entityManager.getTransaction().begin();
			entityManager.persist(employeeEntity);
			//entityManager.persist(assetEntity);
			entityManager.getTransaction().commit();
			employeeId=employeeEntity.getEmployeeId();
			
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		return employeeId;
	}*/
	

}
