package com.davos.marketworld.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "post")
@Data
@NoArgsConstructor
public class Post {


	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "title", length = 50)
	private String title;
	
	@Column(name = "description", length = 2000)
	private String description;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "id_user")
	private User user;
	
	@Column(name = "category", length = 50)
	private String category;
	
	@Column(name = "subcategory", length = 50)
	private String subcategory;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "post", cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	private List<PostImage> images;

	public Post(long id, String title, String description, User user, String category, String subcategory) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.user = user;
		this.category=category;

		this.subcategory=subcategory;
	}
	
	public void addImages(PostImage image) {
		images.add(image);
	}
	
	
	
	
}
