package com.gestion.dao;

import com.gestion.bean.Enseignant;
import com.gestion.bean.Faculte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnseignantDao extends JpaRepository<Enseignant,Long> {
    Enseignant findByReference(String Ref);
    List<Enseignant> findByGrade(String grade);

    Enseignant deleteByReference(String ref);
}
