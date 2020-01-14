package com.kento2github.postgresqlmybatis.mappers;

import com.kento2github.postgresqlmybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

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
  public boolean update(User user);

  // 1件削除用メソッド
  public boolean delete(String userId);
}
