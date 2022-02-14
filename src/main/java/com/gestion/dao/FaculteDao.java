package com.gestion.dao;

import com.gestion.bean.Faculte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FaculteDao extends JpaRepository<Faculte,Long> {

    Faculte findByReference(String Ref);
    Faculte findByLibelle(String Lib);

    Faculte deleteByReference(String ref);
}
