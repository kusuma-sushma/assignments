package com.capg.springassign.dao;

import com.capg.springassign.bean.EmployeeInfoBean;

public interface EmployeeDao {

	EmployeeInfoBean getEmployee(int empId);
	boolean addEmployee(EmployeeInfoBean employeeInfoBean);
}
