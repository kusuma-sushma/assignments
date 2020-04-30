package com.capg.springassign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.capg.springassign.bean.EmployeeInfoBean;
import com.capg.springassign.service.EmployeeServiceImp;

@Controller
public class EmployeeController {
	
	//private EmployeeService dao = new EmployeeDaoHibernateImp();
	//private EmployeeService service = new EmployeeServiceImp();
	
	@GetMapping("/getEmployeeForm")
	public String getEmployeeForm() {
		return "searchEmployee";
	}
	
	@GetMapping("getEmployee")
	public String getEmployee(int empId, ModelMap modelMap) {
		EmployeeInfoBean employeeInfoBean = service.getEmployee(empId);
		
		if (employeeInfoBean !=null) {
			modelMap.addAttribute("employeeInfo", employeeInfoBean);
		} else {
			modelMap.addAttribute("errMsg", "Employee ID Not Found");
		}
	}

}
