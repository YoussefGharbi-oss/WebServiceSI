package com.example.webservicesi.api.Service;

import com.example.webservicesi.api.Model.User;
import com.example.webservicesi.api.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public List<User> getAllUsers() {
        System.out.println(userRepo.findAll());
        return userRepo.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }

    public User saveUser(User user) {
        return userRepo.saveAndFlush(user);
    }


    public void deleteUSer(Long id) {
        userRepo.deleteById(id);
    }

    public User updateUser(User user) {
        if (userRepo.existsById((long) user.getId())) {
            return userRepo.save(user);
        } else {
            throw new RuntimeException("User not found with ID: " + user.getId());
        }
    }

}