package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.model.User;

@Service
public interface UserService {
	// create
	public User create(User user);

	// update
	public User update(int userid, User user);

	// get single user
	public User getOne(int userid);

	// getAll
	public List<User> getAll();

	// deleete
	public void delete(int userid);

}
