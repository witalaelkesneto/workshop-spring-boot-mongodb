package com.eteg.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eteg.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
}