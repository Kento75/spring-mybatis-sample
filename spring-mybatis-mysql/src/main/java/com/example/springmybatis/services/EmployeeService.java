package com.example.springmybatis.services;

import com.example.springmybatis.entities.Employee;

import java.util.List;

public interface EmployeeService {

  // 全件検索用メソッド
  public List<Employee> getAllEmployees();
}
