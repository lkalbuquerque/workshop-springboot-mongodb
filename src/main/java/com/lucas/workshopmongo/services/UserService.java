package com.lucas.workshopmongo.services;

import com.lucas.workshopmongo.domain.User;
import com.lucas.workshopmongo.dto.UserDTO;
import com.lucas.workshopmongo.repository.UserRepository;
import com.lucas.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findALL(){
        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(()-> new ObjectNotFoundException("Objeto Não Encontrado"));
    }

    public User insert (User obj){
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(),objDto.getName(),objDto.getEmail());
    }
}
