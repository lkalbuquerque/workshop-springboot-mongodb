package com.lucas.workshopmongo.repository;

import com.lucas.workshopmongo.domain.Post;
import com.lucas.workshopmongo.domain.User;
import javafx.geometry.Pos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {

        @Query("{ 'title' :{ $regex: ?0, $options: 'i'} }")
        List<Post> searchTitle(String text);

        List<Post> findByTitleContainingIgnoreCase(String text);
}
