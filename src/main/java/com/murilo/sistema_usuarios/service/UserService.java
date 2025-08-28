package com.murilo.sistema_usuarios.service;

import com.murilo.sistema_usuarios.exception.EmailAlreadyExistsException;
import com.murilo.sistema_usuarios.exception.UserNotFoundExceptions;
import com.murilo.sistema_usuarios.model.User;
import com.murilo.sistema_usuarios.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    private UserRepository userRep;

    public UserService(UserRepository userRep) {
        this.userRep = userRep;
    }


    public List<User> getAllUsers(){
        return userRep.findAll();
    }

    public User getUserById(Long id){

        return userRep.findById(id).orElseThrow(() -> new UserNotFoundExceptions(id));
    }



    public User createUser(@RequestBody User user){

        if(userRep.existsByEmail(user.getEmail())){
            throw new EmailAlreadyExistsException(user.getEmail());
        }

        user.setCreatedAt(LocalDateTime.now());
        return userRep.save(user);


    }



    public void deleteUser(@PathVariable Long id){

        User user = userRep.findById(id).orElseThrow(() -> new UserNotFoundExceptions(id));

       userRep.delete(user);


    }



    public User updateUser(Long id, User userDetails){

        User user = userRep.findById(id).orElseThrow(() -> new UserNotFoundExceptions(id));

        user.setUsername(userDetails.getUsername());
        user.setEmail(userDetails.getEmail());

        return userRep.save(user);
    }
}
