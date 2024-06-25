package com.acc.lkm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acc.lkm.businessbean.DepartmentBean;
import com.acc.lkm.businessbean.EmployeeBean;
import com.acc.lkm.dao.EmployeeDAO;
import com.acc.lkm.exceptions.InvalidDummyException;
import com.acc.lkm.exceptions.InvalidUpdateOperationException;
@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
private EmployeeDAO employeeDAO;

@Override
//@Transactional(value="txManager",rollbackFor=InvalidDummyException.class)
@Transactional(value="txManager")
public Integer addEmployeeAndDepartment(EmployeeBean employeeBean, DepartmentBean departmentBean) throws Exception {
	// TODO Auto-generated method stub
	int result=0;
	try {
		int deptId=employeeDAO.addDepartment(departmentBean);
		employeeBean.setDepartmentCode(deptId);
		result=deptId + employeeDAO.addEmployee(employeeBean);
	}catch(Exception ex) {
		throw ex;
	}
	return result;
}

	/*@Override
	public EmployeeBean getEmployeeDetails(Integer id) throws Exception {
		// TODO Auto-generated method stub
		EmployeeBean emp= employeeDAO.getEmployeeDetails(id);
		if(emp==null) {
			throw new InvalidUpdateOperationException();
		}
		return emp;
	}*/

}
