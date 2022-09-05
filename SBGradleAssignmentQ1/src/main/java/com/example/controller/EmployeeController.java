package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeRepo;
import com.example.model.Employee;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepo employeerepo;

	@RequestMapping(value="/Homepage", method = RequestMethod.GET, produces = "application/json")
	public List<Employee> homePage()
	{
		return employeerepo.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable("id") int id)
	{
		Optional<Employee> e = employeerepo.findById(id);
		return e;
	}
	
	@PostMapping
	public Employee getdata(@RequestBody Employee employee)
	{
		return employeerepo.save(employee);
	}
	
}
