package com.davos.marketworld.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davos.marketworld.entity.Post;
import com.davos.marketworld.entity.PostImage;

@Repository
public interface PostImageRepository extends JpaRepository<PostImage, Serializable>{

	public abstract PostImage findById(long id);
	
	public abstract List<PostImage> findByPost(Post post);
	
	public abstract Page<PostImage> findAll(Pageable pageable);
}
