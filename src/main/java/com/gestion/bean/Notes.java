package com.gestion.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int note;
    /*@ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Etudiant etudiant;*/
    @ManyToOne
    @JoinColumn(name="etudiant_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Etudiant etudiant;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Cours getCours() {
        return cours;
    }

    public void setCours(Cours cours) {
        this.cours = cours;
    }

    /*@ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Cours cours;*/

    @ManyToOne
    @JoinColumn(name="cours_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Cours cours;

}
