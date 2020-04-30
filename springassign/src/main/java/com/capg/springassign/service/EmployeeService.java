package com.capg.springassign.service;

import com.capg.springassign.bean.EmployeeInfoBean;

interface EmployeeService {

	EmployeeInfoBean getEmployee(int empId);
	boolean addEmployee(EmployeeInfoBean employeeInfoBean);
}
