package com.gestion.bean;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Enseignant {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String nom;
    private String grade;
    private Date anciennete;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Date getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(Date anciennete) {
        this.anciennete = anciennete;
    }
}
