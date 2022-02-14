package com.gestion.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Enseignant {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Reference;
    private String Nom;
    private String Grade;
    private Date Anciennete;
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public Date getAnciennete() {
        return Anciennete;
    }

    public void setAnciennete(Date anciennete) {
        Anciennete = anciennete;
    }







}
