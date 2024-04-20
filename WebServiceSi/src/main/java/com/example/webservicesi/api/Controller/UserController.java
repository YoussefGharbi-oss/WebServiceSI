package com.example.webservicesi.api.Controller;

import com.example.webservicesi.api.Model.User;
import com.example.webservicesi.api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()

@RequestMapping("/api")
public class UserController {


    @Autowired
    private UserService userService ;


    @GetMapping("users")
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }
    @GetMapping("users/{id}")
    Optional<User> getUser(@PathVariable int id) {
        return userService.getUserById((long) id);
    }


    @PostMapping("users/create")
    public ResponseEntity<User> createStudent(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    @DeleteMapping("users/{id}")
       public void  deleteUser(@PathVariable int id) {
         userService.deleteUSer((long) id);
    }

    @PatchMapping("users")
    public  User UpdateUser(@RequestBody User user) {
        return userService.updateUser(user) ;
    }

}