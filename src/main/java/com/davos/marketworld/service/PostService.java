package com.davos.marketworld.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.davos.marketworld.dto.PostDto;
import com.davos.marketworld.entity.User;

@Service
public interface PostService {
	
public User get(long id);
	
	public List<PostDto> getPosts(String key,Pageable pageable);
	
	public void saveOrUpdate(PostDto postDto);
	
	public void delete(PostDto postDto);

}
