package com.example.webservicesi.api.Controller;


import com.example.webservicesi.api.Model.FournituresAchat;
import com.example.webservicesi.api.Model.User;
import com.example.webservicesi.api.Repository.FournitureRepo;
import com.example.webservicesi.api.Service.FournituresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()

@RequestMapping("/api")
public class FournitureController {


    @Autowired
    private FournituresService fournituresService ;


    @GetMapping("fournitures")
    public List<FournituresAchat> getAllUsers() {

        return fournituresService.getAllFourniture();
    }
    @GetMapping("fournitures/{id}")
    Optional<FournituresAchat> getUser(@PathVariable int id) {
        return fournituresService.getFournitureById((long) id);
    }


    @PostMapping("fournitures/create")
    public ResponseEntity<FournituresAchat> createStudent(@RequestBody FournituresAchat fournitures) {
        FournituresAchat savedFourniture = fournituresService.saveFourniture(fournitures);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedFourniture);
    }

    @DeleteMapping("fournitures/{id}")
    public void  deleteUser(@PathVariable int id) {
        fournituresService.deleteFourniture((long) id);
    }

    @PatchMapping("fournitures")
    public  FournituresAchat UpdateUser(@RequestBody FournituresAchat fourniture) {
        return fournituresService.updateFourniture(fourniture) ;
    }

}