package com.kento2github.postgresqlmybatis.controllers;

import com.kento2github.postgresqlmybatis.model.User;
import com.kento2github.postgresqlmybatis.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

   @Autowired
   UserService userService;

  @GetMapping("")
  public List<User> getUsers() {
    return userService.selectMany();
  }

  @GetMapping("/{userId}")
  public User getUser(@PathVariable("userId") String userId) {
    return userService.selectOne(userId);
  }

  @PostMapping("/insert")
  public String insert(@RequestBody User user) {

    boolean result = userService.insert(user);

    if (result) {
      return "{\"result\":\"ok\"}";
    }
    return "{\"result\":\"error\"}";
  }

  @PutMapping("/update")
  public String update(@RequestBody User user) {

    boolean result = userService.update(user);

    if (result) {
      return "{\"result\":\"ok\"}";
    }
    return "{\"result\":\"error\"}";
  }

  @DeleteMapping("/delete/{userId}")
  public String delete(@PathVariable("userId") String userId) {

    boolean result = userService.delete(userId);

    if (result) {
      return "{\"result\":\"ok\"}";
    }
    return "{\"result\":\"error\"}";
  }
}
