package com.davos.marketworld.dto;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.davos.marketworld.entity.Post;
import com.davos.marketworld.entity.PostImage;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class PostDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String title;
	
	private String description;
	
	private UserDto user;
	
	private String category;
	
	private String subcategory;
	
	private List<String> uriImages;
	
	public PostDto(Post post) {
		this.id = post.getId();
		this.title = post.getTitle();
		this.description = post.getDescription();
		this.user = new UserDto(post.getUser());
		this.category = post.getCategory();
		this.subcategory = post.getSubcategory();
		
		this.uriImages = new ArrayList<>();
		List<PostImage> images = post.getImages();
		
		for (PostImage postImage : images) {
			uriImages.add(postImage.getName());
		}
		
	}
	
	public Post toPost() {
		return new Post(this.id, this.title, this.description, this.user.toUser(),this.category,this.subcategory);
		
	}

	
}
