package com.gestion.dao;

import com.gestion.bean.Cours;
import com.gestion.bean.Etudiant;
import com.gestion.bean.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesDao extends JpaRepository<Notes,Long> {
    //Notes findByNote(int note);
    Notes findByEtudiantReferenceAndCoursReference(String etudiantRef, String coursRef);
    List<Notes>findByEtudiantReference(String etudiantRef);
    List<Notes>findByCoursReference(String coursRef);
}
