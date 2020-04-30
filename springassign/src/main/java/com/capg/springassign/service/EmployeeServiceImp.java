package com.capg.springassign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springassign.bean.EmployeeInfoBean;
import com.capg.springassign.dao.EmployeeDao;
import com.capg.springassign.dao.EmployeeDaoHibernateImp;

@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	private EmployeeDao dao = new EmployeeDaoHibernateImp();

	public EmployeeInfoBean getEmployee(int empId) {
		if (empId <1) {
		return null;
	} 
		return dao.getEmployee(empId);
	}

	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
