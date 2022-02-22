package com.gestion.dao;

import com.gestion.bean.Cours;
import com.gestion.bean.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursDao extends JpaRepository<Cours,Long> {
    Cours findByReference(String ref);
    Cours findByLibelleAndEnseignant(String libelle, Enseignant enseignant);
    Cours deleteByReference(String ref);
}
