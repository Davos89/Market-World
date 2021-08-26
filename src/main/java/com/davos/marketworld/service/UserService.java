package com.davos.marketworld.service;

import org.springframework.stereotype.Service;

import com.davos.marketworld.entity.User;

@Service
public interface UserService {

	public User get(long id);
	
	public User get(String username);
	
	public void saveOrUpdate(User user);
	
	public void delete(User user);
}
