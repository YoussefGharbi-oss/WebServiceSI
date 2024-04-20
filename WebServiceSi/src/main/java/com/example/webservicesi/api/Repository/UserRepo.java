package com.example.webservicesi.api.Repository ;
import com.example.webservicesi.api.Model.User ;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}