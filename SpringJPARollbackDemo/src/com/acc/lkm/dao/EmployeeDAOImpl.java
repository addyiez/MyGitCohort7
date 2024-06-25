package com.acc.lkm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.acc.lkm.businessbean.DepartmentBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.entity.DepartmentEntity;
import com.acc.lkm.entity.EmployeeEntity;
import com.acc.lkm.exceptions.InvalidDummyException;

@Repository
//Specialization of @component annotation
@SuppressWarnings("unchecked")

public class EmployeeDAOImpl implements EmployeeDAO {
	//@Autowired
	@PersistenceContext
	//private EntityManagerFactory EntityManagerFactory;
	private EntityManager entityManager;

	@Override
	//@Transactional(value="txManager",readOnly=false)
	//@Transactional(value="txManager",timeout=7)
	//@Transactional(value="txManager",rollbackFor=InvalidDummyException.class)
	//@Transactional(value="txManager",propagation=Propagation.REQUIRES_NEW)
	@Transactional(value="txManager",propagation=Propagation.REQUIRED)
	public Integer addEmployee(EmployeeBean employeeBean) throws Exception {
		// TODO Auto-generated method stub
		Integer employeeID=0;
		//EntityManager entityManager=null;
		EmployeeEntity employeeEntityBean =convertBeanToEntity(employeeBean);
		try {
			//entityManager=EntityManagerFactory.createEntityManager();
			//entityManager.getTransaction().begin();
			//Thread.currentThread().sleep(5000);
			entityManager.persist(employeeEntityBean);
			dummyexception();
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

	private void dummyexception() throws InvalidDummyException {
		throw new InvalidDummyException();
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(value="txManager",propagation=Propagation.REQUIRED)
	//@Transactional(value="txManager",propagation=Propagation.REQUIRES_NEW)
	//@Transactional(value="txManager")
	public Integer addDepartment(DepartmentBean departmentBean) throws Exception {
		// TODO Auto-generated method stub
		Integer departmentcode=0;
		DepartmentEntity departmentEntityBean=convertDepartmentBeanToEntity(departmentBean);
		try {
			entityManager.persist(departmentEntityBean);
			departmentcode=departmentEntityBean.getDepartmentCode();
		}catch(Exception ex) {
			throw ex;
		}
		return departmentcode;
	}

	
	private DepartmentEntity convertDepartmentBeanToEntity(DepartmentBean departmentBean) {
		// TODO Auto-generated method stub
		DepartmentEntity departmentEntityBean=new DepartmentEntity();
		BeanUtils.copyProperties(departmentBean, departmentEntityBean);
		return departmentEntityBean;
	}
	private DepartmentBean convertDepartmentEntityToBean(DepartmentEntity entity) {
		// TODO Auto-generated method stub
		DepartmentBean departmentBean=new DepartmentBean();
		BeanUtils.copyProperties(entity, departmentBean);
		return departmentBean;
	}

	/*@Override
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
	}*/
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
