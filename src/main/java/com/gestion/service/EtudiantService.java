package com.gestion.service;


import com.gestion.bean.Etudiant;
import com.gestion.dao.EtudiantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class EtudiantService {

    public Etudiant findByReference(String ref) {
        return etudiantDao.findByReference(ref);
    }

    public Optional<Etudiant> findById(Long Id) {
        return etudiantDao.findById(Id);
    }
    @Transactional
    public Etudiant deleteByReference(String ref) {
        return etudiantDao.deleteByReference(ref);
    }
    public int save(Etudiant entity) {
        if (findByReference(entity.getReference())!=null)
            return -1;
        etudiantDao.save(entity);
        return 0;
    }


    @Autowired
    private EtudiantDao etudiantDao;
}




