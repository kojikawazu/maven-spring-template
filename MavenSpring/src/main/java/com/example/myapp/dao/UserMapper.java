package com.example.myapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.myapp.entity.User;

/**
 * ユーザーマッパーインターフェース
 * @author nanai
 *
 */
@Mapper
public interface UserMapper {

    List<User> findAll();

    void insert(User user);

    void update(User user);

    void delete(Long id);

    // その他のCRUD操作（更新、削除など）もここに追加
}