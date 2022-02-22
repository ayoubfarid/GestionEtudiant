package com.gestion.bean;

import javax.persistence.*;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Reference;
    private Long Id;
    private String Libelle;
    private int HeursCours;
    private int HeursTp;
    @ManyToOne
    private Enseignant enseignant;

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

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

    public int getHeursCours() {
        return HeursCours;
    }

    public void setHeursCours(int heursCours) {
        HeursCours = heursCours;
    }

    public int getHeursTp() {
        return HeursTp;
    }

    public void setHeursTp(int heursTp) {
        HeursTp = heursTp;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }
}
