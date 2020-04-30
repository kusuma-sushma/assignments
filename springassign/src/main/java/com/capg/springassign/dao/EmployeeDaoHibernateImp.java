package com.capg.springassign.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.capg.springassign.bean.EmployeeInfoBean;

@Repository
public class EmployeeDaoHibernateImp implements EmployeeDao{

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("empdb");

	public EmployeeInfoBean getEmployee(int empId) {
		EntityManager manager = factory.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		return employeeInfoBean;
	}

	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return false;
	}
}
