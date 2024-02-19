package com.example.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.dao.UserMapper;
import com.example.myapp.entity.User;

/**
 * ユーザーサービスクラス
 * @author nanai
 *
 */
@Service
public class UserService {

	// Mapper(Bean)
    private UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
    	this.userMapper = userMapper;
    }
    
    public List<User> findAll() {
        return userMapper.findAll();
    }

    public void addUser(User user) {
        userMapper.insert(user);
    }

    public void updateUser(User user) {
        userMapper.update(user);
    }

    public void deleteUser(Long id) {
        userMapper.delete(id);
    }
}
