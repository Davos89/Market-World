package com.davos.marketworld.service.impl;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.davos.marketworld.dto.PostDto;
import com.davos.marketworld.entity.User;
import com.davos.marketworld.service.PostService;

public class PostServiceImpl implements PostService {

	@Override
	public User get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostDto> getPosts(String key, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(PostDto postDto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(PostDto postDto) {
		// TODO Auto-generated method stub

	}

}
