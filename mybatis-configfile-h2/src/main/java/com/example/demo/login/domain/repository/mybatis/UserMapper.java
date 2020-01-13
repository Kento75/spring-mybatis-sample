package com.example.demo.login.domain.repository.mybatis;

import com.example.demo.login.domain.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

  // 登録用メソッド
  public boolean insert(User user);

  // 1件検索用メソッド
  public User selectOne(String userId);

  // 全件検索用メソッド
  public List<User> selectMany();

  // 1件更新用メソッド
  public boolean updateOne(User user);

  // 1件削除用メソッド
  public boolean deleteOne(String userId);
}
