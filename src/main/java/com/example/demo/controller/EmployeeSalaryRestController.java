package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;

@RestController
@RequestMapping("/salary")
public class EmployeeSalaryRestController {

	
	@GetMapping("/getSalary")
	public String getSalary() {
		return "Employee Salary is 500000";
	}
	
	@GetMapping("/msg/{code}")
	public String getMsg(
			@PathVariable("code")String code )
	{
		return "FROM SALARY=>"+code;
	}
	
	
	@PostMapping("/saveUser")
	public ResponseEntity<?>  saveUserData(@RequestBody User user){
		List<Map<String,Object>> responseData=new ArrayList();
		Map<String,Object> data=new HashMap<>();
		data.put("data", user);
		responseData.add(data);
		data.put("message", "successful data created");
		responseData.add(data);
		data.put("status", 200);
		responseData.add(data);
		return  ResponseEntity.ok(responseData);
	}
	


}
