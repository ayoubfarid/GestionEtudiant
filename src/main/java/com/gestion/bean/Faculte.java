package com.gestion.bean;


import javax.persistence.*;


@Entity
public class Faculte {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String Libelle;

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    private String Reference;
    private Long Id;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }








}
