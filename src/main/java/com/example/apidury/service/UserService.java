package com.example.apidury.service;

import com.example.apidury.model.User;
import com.example.apidury.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> loadAll() {
        return userRepository.findAll();
    }

    public Optional<User> get(String userId){
        return userRepository.findById(userId);
    }

    public User createUser(User user) {
        Optional<User> existingUser = userRepository.findByUsername(user.getUsername());

        if (!existingUser.isPresent()) {
            userRepository.save(user);
        }

        return user;
    }


    public User updateUser(User user){
        Optional<User> userdb = userRepository.findById(user.getId());

        if(userdb.isPresent()){
            User userUpdate = userdb.get();
            userUpdate.setUsername(user.getUsername());
            userUpdate.setPassword(user.getPassword());
            return userUpdate;
        }
        else{
            throw new RuntimeException("User not found");
        }
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }


    public Optional<User> findByUsernameAndPassword(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }


}
