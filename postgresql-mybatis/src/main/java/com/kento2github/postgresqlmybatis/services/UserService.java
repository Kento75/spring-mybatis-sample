package com.kento2github.postgresqlmybatis.services;

import com.kento2github.postgresqlmybatis.model.User;

import java.util.List;

public interface UserService {

  //１件登録用メソッド
  public boolean insert(User user);

  //１件検索用メソッド
  public User selectOne(String userId);

  //全件検索用メソッド
  public List<User> selectMany();

  //１件更新用メソッド
  public boolean update(User user);

  //１件削除用メソッド
  public boolean delete(String userId);
}
