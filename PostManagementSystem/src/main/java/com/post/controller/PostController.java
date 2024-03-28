package com.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.post.entity.Post;
import com.post.repository.PostRepository;

@RestController
@RequestMapping("/post")
public class PostController {
@Autowired
	PostRepository repo;
@PostMapping
public Post createpost(@RequestBody Post p)
{
	return repo.save(p);
	
}
}
