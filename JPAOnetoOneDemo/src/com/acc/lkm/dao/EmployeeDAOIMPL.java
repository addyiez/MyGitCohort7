package com.acc.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.acc.lkm.businessbean.AssetBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.entity.AssetEntity;
import com.acc.lkm.entity.EmployeeEntity;
import com.acc.lkm.utility.JPAUtility;

public class EmployeeDAOIMPL implements EmployeeDAO{

	@Override
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
	}

}
