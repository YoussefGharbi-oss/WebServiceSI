package com.example.webservicesi.api.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Fournitures_achats")
public class FournituresAchat {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "nom")
    private String nom ;
    @Column(name = "description ")
    private String description  ;
    @Column(name = "quantite ")

    private int quantite  ;
    @Column(name = "prix ")

    private int prix  ;
    @Column(name = "date_achat")

    private Date date_achat  ;
    @Column(name = "fournisseur ")
    private String fournisseur  ;

    public FournituresAchat() {
    }

    public FournituresAchat(int id, String nom, String description, int quantite, int prix, Date date_achat, String fournisseur) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.quantite = quantite;
        this.prix = prix;
        this.date_achat = date_achat;
        this.fournisseur = fournisseur;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public Date getDate_achat() {
        return date_achat;
    }

    public void setDate_achat(Date date_achat) {
        this.date_achat = date_achat;
    }

    public String getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(String fournisseur) {
        this.fournisseur = fournisseur;
    }
}
