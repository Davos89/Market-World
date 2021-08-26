package com.davos.marketworld.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davos.marketworld.entity.Post;
import com.davos.marketworld.entity.User;

@Repository
public interface PostRepository extends JpaRepository<Post, Serializable> {

	public abstract Post findById(long id);

	public abstract List<Post> findByUser(User user);

	public abstract List<Post> findByCategory(String category);

	public abstract List<Post> findBySubcategory(String subcategory);

	public abstract Page<Post> findAll(Pageable pageable);

}
