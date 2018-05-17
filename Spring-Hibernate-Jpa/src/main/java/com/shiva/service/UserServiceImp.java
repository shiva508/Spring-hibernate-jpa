package com.shiva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shiva.dao.UserDao;
import com.shiva.entity.User;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	@Transactional
	public List<User> getAllUsers() 
	{
		return userDao.getAll();
	}

}
