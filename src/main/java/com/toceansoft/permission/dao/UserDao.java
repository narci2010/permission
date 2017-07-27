package com.toceansoft.permission.dao;

import com.toceansoft.permission.entity.User;

import java.util.List;

/**
 * <p>User: Narci Lee
 * <p>Date: 17-7-27
 * <p>Version: 1.0
 */
public interface UserDao {

    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}
