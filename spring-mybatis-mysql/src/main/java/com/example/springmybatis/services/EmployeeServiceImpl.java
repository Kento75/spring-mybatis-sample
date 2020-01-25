package com.example.springmybatis.services;

import com.example.springmybatis.entities.Employee;
import com.example.springmybatis.mappers.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired EmployeeMapper employeeMapper;

  @Override
  public List<Employee> getAllEmployees() {
    return employeeMapper.getAllEmployees();
  }
}
