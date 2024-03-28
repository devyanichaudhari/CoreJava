package com.post.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Post_Info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int postId;
	@Column(name="postName")
	private String postName;
	@Column(name="postDesc")
	private String postDesc;
	@Column(name="published")
	private boolean published;
}
