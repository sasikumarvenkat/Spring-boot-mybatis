package com.project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.application.model.User;
import com.project.dao.mapper.UserMapper;

@Component
public class UserDao {

	@Autowired
	UserMapper mapper;

	public boolean insertUser(User user) {
		boolean isAdded = mapper.insertUser(user) > 0;
		return isAdded;
	}

	public User getUser(int userId) {
		User user = mapper.getUser(userId);
		return user;
	}
}
