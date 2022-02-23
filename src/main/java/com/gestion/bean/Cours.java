package com.gestion.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="cours")
public class Cours {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String reference;
    private Long id;
    private String libelle;
    private int heurscours;
    private int heurstp;
    @ManyToOne
    private Enseignant enseignant;


   // private List<User> user = new ArrayList<>();
    //@OneToMany(mappedBy = "cours")
   @OneToMany( mappedBy="cours")
    private List<Notes> notes= new ArrayList<>();

    public String getReference() {
        return reference;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
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

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getHeurscours() {
        return heurscours;
    }

    public void setHeurscours(int heurscours) {
        this.heurscours = heurscours;
    }

    public int getHeurstp() {
        return heurstp;
    }

    public void setHeurstp(int heurstp) {
        this.heurstp = heurstp;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }
}
