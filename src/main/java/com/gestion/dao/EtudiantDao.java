package com.gestion.dao;

import com.gestion.bean.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant,Long> {
    Etudiant findByReference(String ref);
    Optional<Etudiant> findById(Long Id);

    Etudiant deleteByReference(String ref);
}



