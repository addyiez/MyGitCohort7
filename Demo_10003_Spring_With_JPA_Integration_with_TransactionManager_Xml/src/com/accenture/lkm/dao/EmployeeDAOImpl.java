package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.Date; // Add this import
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.business.bean.EmployeeBean;
import com.accenture.lkm.entity.EmployeeEntity;

@Repository
@SuppressWarnings("unchecked")
@Transactional(value="txManager")
public class EmployeeDAOImpl implements EmployeeDAO {
    
    @PersistenceContext
    private EntityManager entityManager;
    
	
	public Integer addEmployee(EmployeeBean employeeBean) throws Exception{
		// TODO Auto-generated method stub
		Integer employeeID = 0;
		
		EmployeeEntity employeeEntityBean =convertBeanToEntity(employeeBean);
		try {
		
			
				entityManager.persist(employeeEntityBean);
				
			employeeID = employeeEntityBean.getId();
		} catch (Exception exception) {
			throw exception;
		}
		return employeeID;
	}
	
	public List<EmployeeBean> getEmployeeDetailsWithin(Date startDate, Date endDate) throws Exception {
        try {
            return entityManager.createQuery("SELECT e FROM EmployeeEntity e WHERE e.insertTime BETWEEN :startDate AND :endDate")
                                .setParameter("startDate", startDate)
                                .setParameter("endDate", endDate)
                                .getResultList();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public Integer updateEmployeeSalaryWithRole(String role, Double salary) throws Exception {
        try {
            return entityManager.createQuery("UPDATE EmployeeEntity e SET e.salary = :salary WHERE e.role = :role")
                                .setParameter("salary", salary)
                                .setParameter("role", role)
                                .executeUpdate();
        } catch (Exception ex) {
            throw ex;
        }
    }

    public Integer deleteEmployeeByName(String name) throws Exception {
        try {
            return entityManager.createQuery("DELETE FROM EmployeeEntity e WHERE e.name = :name")
                                .setParameter("name", name)
                                .executeUpdate();
        } catch (Exception ex) {
            throw ex;
        }
    }
    
	
	
	public List<EmployeeBean> getEmployeeList() throws Exception{
		// TODO Auto-generated method stub
		List<EmployeeBean> listEmployeeBean = null;
		
		try {
		
			listEmployeeBean=new ArrayList<EmployeeBean>();
			List<EmployeeEntity> listEmployeeEntity= (List<EmployeeEntity>) entityManager.createQuery("from EmployeeEntity").getResultList();

			for (EmployeeEntity entity:listEmployeeEntity){
				EmployeeBean emp= convertEntityToBean(entity);
				listEmployeeBean.add(emp);
			}
			

		} catch (Exception exception) {
			throw exception;
		}
		
		//return employeeEntityBean2;
		return (listEmployeeBean);
	}
	
	public static EmployeeBean convertEntityToBean(EmployeeEntity entity){
		EmployeeBean employee = new EmployeeBean();
		BeanUtils.copyProperties(entity, employee);
		return employee;
	}
	public static EmployeeEntity convertBeanToEntity(EmployeeBean bean){
		EmployeeEntity employeeEntityBean = new EmployeeEntity();
		BeanUtils.copyProperties(bean,employeeEntityBean);
		return employeeEntityBean;
	}

	@Override
	public EmployeeBean getEmployeeDetails(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean updateEmployeeDetails(EmployeeBean employeeBean) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeBean deleteEmployeeDetails(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
