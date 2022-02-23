package com.gestion.bean;


import javax.persistence.*;


@Entity
public class Faculte {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String libelle;


    private String reference;
    private Long id;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
