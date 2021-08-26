package com.davos.marketworld.dto;


import java.io.Serializable;

import com.davos.marketworld.entity.User;

import lombok.Data;

@Data
public class UserDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String username;
	
	
	
	public UserDto(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
	}



	public User toUser() {
		
		return new User(this.id,this.username);
	}

}
