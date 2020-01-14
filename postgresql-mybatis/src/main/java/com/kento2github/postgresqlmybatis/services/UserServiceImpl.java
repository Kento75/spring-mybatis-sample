package com.kento2github.postgresqlmybatis.services;

import com.kento2github.postgresqlmybatis.mappers.UserMapper;
import com.kento2github.postgresqlmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

  @Autowired
  UserMapper userMapper;

  @Override
  public boolean insert(User user) {
    return userMapper.insert(user);
  }

  @Override
  public User selectOne(String userId) {
    return userMapper.selectOne(userId);
  }

  @Override
  public List<User> selectMany() {
    return userMapper.selectMany();
  }

  @Override
  public boolean update(User user) {
    return userMapper.update(user);
  }

  @Override
  public boolean delete(String userId) {
    return userMapper.delete(userId);
  }
}
