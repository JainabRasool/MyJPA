package com.company.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.proj.dao.EmployeeDao;
import com.company.proj.model.EmployeeModel;

@Controller
public class EmpController {
	
	
	@Autowired
	EmployeeDao edao;
	
	@RequestMapping("/MyHome")
	public String showHome() {
		
		return "home.jsp";
	}
	
	@RequestMapping("/addEmp")
	public String addEmp(EmployeeModel emp) {
		
		System.out.println("Id is::"+ emp.geteId()+"  --Name is--"+emp.geteName());
		
		edao.save(emp);
		
		return "home.jsp";
	}
	
	@RequestMapping("/getEmp")
	public String getEmp(EmployeeModel em) {
		System.out.println("No of entry in DB is::"+ edao.count());
		System.out.println("Id 101 in DB is::"+ edao.existsById(101));
			
		return "home.jsp";
	}

}
