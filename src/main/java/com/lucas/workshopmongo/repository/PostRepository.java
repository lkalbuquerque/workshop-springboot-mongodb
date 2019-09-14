package com.lucas.workshopmongo.repository;

import com.lucas.workshopmongo.domain.Post;
import com.lucas.workshopmongo.domain.User;
import javafx.geometry.Pos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {
        List<Post> findByTitleContainingIgnoreCase(String text);
}
