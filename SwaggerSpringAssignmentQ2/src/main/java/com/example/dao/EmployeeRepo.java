package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
