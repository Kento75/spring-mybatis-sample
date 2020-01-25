package com.example.springmybatis.controllers;

import com.example.springmybatis.entities.Employee;
import com.example.springmybatis.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class EmployeeController {

  @Autowired EmployeeService employeeService;

  @GetMapping({"", "/", "/index", "/index.html"})
  public List<Employee> index() {
    return employeeService.getAllEmployees();
  }
}
