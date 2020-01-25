package com.example.springmybatis.mappers;

import com.example.springmybatis.entities.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
  // 全件検索用メソッド
  public List<Employee> getAllEmployees();
}
