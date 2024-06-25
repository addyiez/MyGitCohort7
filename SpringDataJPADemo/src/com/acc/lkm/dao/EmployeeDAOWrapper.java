package com.acc.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.entity.EmployeeEntity;

@Repository
public class EmployeeDAOWrapper {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	public EmployeeBean addEmployee(EmployeeBean bean)throws Exception{
		EmployeeBean empbean=null;
		
		try {
			EmployeeEntity entity=convertBeanToEntity(bean);
			EmployeeEntity employeeEntity=employeeDAO.save(entity);
			empbean=convertEntityToBean(employeeEntity);
		}catch(Exception ex) {
			throw ex;
		}
		return empbean;
		
	}
	public List<EmployeeBean>getAllEmployees()throws Exception{
		List<EmployeeBean>resultSet=new ArrayList<EmployeeBean>();
		try {
			List<EmployeeEntity>listEntity=(List<EmployeeEntity>)employeeDAO.findAll();
			for(EmployeeEntity empEntity:listEntity) {
				EmployeeBean bean=convertEntityToBean(empEntity);
				resultSet.add(bean);
			}
		}catch(Exception ex) {
			throw ex;
		}
		return resultSet;
		
	}
	
	/*public EmployeeBean getEmployeeDetails(Integer id)throws Exception{
		EmployeeBean employeeBean=null;
		try {
			EmployeeEntity empEntity=employeeDAO.findOne(id);
			if(empEntity!=null) {
				employeeBean=convertEntityToBean(empEntity);
				
			}
		}catch(Exception ex) {
			throw ex;
		}
		return employeeBean;
	}
	
	public List<EmployeeBean>getAllEmployees()throws Exception{
		List<EmployeeBean>resultSet=new ArrayList<EmployeeBean>();
		try {
			List<EmployeeEntity>listEntity=(List<EmployeeEntity>)employeeDAO.findAll();
			for(EmployeeEntity empEntity:listEntity) {
				EmployeeBean bean=convertEntityToBean(empEntity);
				resultSet.add(bean);
			}
		}catch(Exception ex) {
			throw ex;
		}
		return resultSet;
		
	}*/
	
	private EmployeeBean convertEntityToBean(EmployeeEntity employeeEntity) {
		EmployeeBean employee=new EmployeeBean();
		BeanUtils.copyProperties(employeeEntity,employee);
		return employee;
	}



	private EmployeeEntity convertBeanToEntity(EmployeeBean employeeBean) {
		EmployeeEntity employeeEntity=new EmployeeEntity();
		BeanUtils.copyProperties(employeeBean,employeeEntity);
		return employeeEntity;
	}

}
