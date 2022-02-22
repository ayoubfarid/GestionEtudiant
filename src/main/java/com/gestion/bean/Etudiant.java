package com.gestion.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Reference;
    private String Nom;
    private Date DateNaissace;
    private String Sexe;
    @ManyToOne
    private Faculte faculte;

    @OneToMany(mappedBy = "etudiant")
    List<Notes> notes;
    private Long Id;

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

    public Date getDateNaissace() {
        return DateNaissace;
    }

    public void setDateNaissace(Date dateNaissace) {
        DateNaissace = dateNaissace;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String sexe) {
        Sexe = sexe;
    }

    public Faculte getFaculte() {
        return faculte;
    }

    public void setFaculte(Faculte faculte) {
        this.faculte = faculte;
    }







}
