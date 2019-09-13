package com.lucas.workshopmongo.repository;

import com.lucas.workshopmongo.domain.Post;
import com.lucas.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

}
