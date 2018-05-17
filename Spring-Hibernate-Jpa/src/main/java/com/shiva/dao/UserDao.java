package com.shiva.dao;

import java.util.List;

import com.shiva.entity.User;

public interface UserDao {
public void add(User user);
public List<User> getAll();
}
