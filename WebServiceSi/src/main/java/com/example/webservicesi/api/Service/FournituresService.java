package com.example.webservicesi.api.Service;

import com.example.webservicesi.api.Model.FournituresAchat;
import com.example.webservicesi.api.Model.User;
import com.example.webservicesi.api.Repository.FournitureRepo;
import com.example.webservicesi.api.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FournituresService {
    @Autowired
    private FournitureRepo fournitureRepo;


    public List<FournituresAchat> getAllFourniture() {
        return fournitureRepo.findAll();
    }

    public Optional<FournituresAchat> getFournitureById(Long id) {
        return fournitureRepo.findById(id);
    }

    public FournituresAchat saveFourniture(FournituresAchat fourniiture) {
        return fournitureRepo.saveAndFlush(fourniiture);
    }



    public void deleteFourniture(Long id) {
        fournitureRepo.deleteById(id);
    }

    public FournituresAchat updateFourniture(FournituresAchat fournitures) {
        if (fournitureRepo.existsById((long) fournitures.getId())) {
            return fournitureRepo.save(fournitures);
        } else {
            throw new RuntimeException("User not found with ID: " + fournitures.getId());
        }
    }

}