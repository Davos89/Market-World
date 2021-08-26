package com.davos.marketworld.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Column(name = "username", unique = true,length = 50)
	private String username;
	
	@NotBlank
	@Column(name = "password",length = 25)
	private String password;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user", cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<Post> posts;

	public User(long id, @NotBlank String username, @NotBlank String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public User(long id, String username) {
		this.id = id;
		this.username = username;
	}
	
	
	

}
