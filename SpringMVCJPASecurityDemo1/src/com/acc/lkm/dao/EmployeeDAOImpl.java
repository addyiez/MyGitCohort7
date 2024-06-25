package com.acc.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.entity.EmployeeEntity;

@Repository
//Specialization of @component annotation
@SuppressWarnings("unchecked")
@Transactional(value="txManager")
public class EmployeeDAOImpl implements EmployeeDAO {
	//@Autowired
	@PersistenceContext
	//private EntityManagerFactory EntityManagerFactory;
	private EntityManager entityManager;

	public Integer addEmployee(EmployeeBean employeeBean) throws Exception {
		// TODO Auto-generated method stub
		Integer employeeID=0;
		//EntityManager entityManager=null;
		EmployeeEntity employeeEntityBean =convertBeanToEntity(employeeBean);
		try {
			//entityManager=EntityManagerFactory.createEntityManager();
			//entityManager.getTransaction().begin();
			entityManager.persist(employeeEntityBean);
			//entityManager.getTransaction().commit();
			employeeID=employeeEntityBean.getId();
		}catch(Exception ex) {
			throw ex;
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		
		return employeeID;
	}

	public EmployeeBean updateEmployeeDetails(EmployeeBean employeeBean) throws Exception {
		// TODO Auto-generated method stub
		EmployeeBean employeeBean2=null;
		try {
			EmployeeEntity employeeEntityBean2=(EmployeeEntity)entityManager.find(EmployeeEntity.class, employeeBean.getId());
		    if(employeeEntityBean2!=null) {
		    	employeeEntityBean2.setInsert_time(employeeBean.getInsert_time());
		    	employeeEntityBean2.setName(employeeBean.getName());
		    	employeeEntityBean2.setRole(employeeBean.getRole());
		    	employeeEntityBean2.setSalary(employeeBean.getSalary());
		    	employeeBean2=convertEntityToBean(employeeEntityBean2);
		    }}
			catch(Exception ex) {
				throw ex;
			}
		
		return employeeBean2;
	}
	
	public EmployeeBean getEmployeeDetails(Integer id) throws Exception {
		// TODO Auto-generated method stub
		EmployeeBean employeeBean=null;
		//EntityManager entityManager=null;
		try {
			//entityManager=EntityManagerFactory.createEntityManager();
			EmployeeEntity employeeEntity=(EmployeeEntity)entityManager.find(EmployeeEntity.class,id);
			if(employeeEntity !=null) {
				employeeBean=convertEntityToBean(employeeEntity);
			}
		}catch(Exception ex) {
			throw ex;
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		return employeeBean;
	}
	private EmployeeBean convertEntityToBean(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		EmployeeBean employee=new EmployeeBean();
		BeanUtils.copyProperties(employeeEntity,employee);
		return employee;
	}


	private EmployeeEntity convertBeanToEntity(EmployeeBean employeeBean) {
		// TODO Auto-generated method stub
		EmployeeEntity employeeEntityBean=new EmployeeEntity();
		BeanUtils.copyProperties(employeeBean, employeeEntityBean);
		return employeeEntityBean;
	}


	


}
