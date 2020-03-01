package com.sapient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.bean.PersonBean;
import com.sapient.interfaces.EmployeeInterface;

@RestController

public class EmployeeController
{
	@Autowired
	EmployeeInterface ei;
//
//	@GetMapping(value="/join")
//	public List<PersonBean> get()
//	{
//		return ei.findAll();
//	}
//	
//	@GetMapping(value="/joinr/{user}")
//	public String getUser(@PathVariable String user)
//	{
//		return ei.getUser1(user);
//	}

}
