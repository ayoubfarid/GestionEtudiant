package com.gestion.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String reference;
    private String nom;
    private Date datenaissace;
    private String sexe;
    @ManyToOne
    private Faculte faculte;

    //@OneToMany(mappedBy = "etudiant")
    @OneToMany(mappedBy="etudiant")
    private List<Notes> notes= new ArrayList<>();
    private Long id;

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

    public Date getDatenaissace() {
        return datenaissace;
    }

    public void setDatenaissace(Date datenaissace) {
        this.datenaissace = datenaissace;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Faculte getFaculte() {
        return faculte;
    }

    public void setFaculte(Faculte faculte) {
        this.faculte = faculte;
    }







}
