package com.example.springmybatis.entities;

import lombok.Data;

@Data
public class Employee {

  private Integer employeeId;
  private String fullname;
  private String email;
  private String gender;
  private String hobbies;
  private String country;
  private String address;
}
