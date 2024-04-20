package com.example.webservicesi.api.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id", nullable = false)
    private int id;


    @Column(name = "nom")
    private String nom ;
    @Column(name = "prenom")
    private String prenom ;
    @Column(name = "email")

    private String email ;
    @Column(name = "date_naissance")

    private Date  date_naissance ;
    @Column(name = "pays")

    private String pays ;
    @Column(name = "ville")

    private String ville ;
    @Column(name = "code_postal")

    private String code_postal ;
    @Column(name = "nombre_achat")

    private int nombre_achat;



    public User() {
    }

    public User(int id, String nom, String prenom, String email, Date date_naissance, String pays, String ville, String code_postal, int nombre_achat) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.date_naissance = date_naissance;
        this.pays = pays;
        this.ville = ville;
        this.code_postal = code_postal;
        this.nombre_achat = nombre_achat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public int getNombre_achat() {
        return nombre_achat;
    }

    public void setNombre_achat(int nombre_achat) {
        this.nombre_achat = nombre_achat;
    }
}
