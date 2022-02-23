package com.gestion.service;

import com.gestion.bean.Cours;
import com.gestion.bean.Enseignant;
import com.gestion.dao.CoursDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CoursService {
    public Cours findByReference(String ref) {
        return coursDao.findByReference(ref);
    }
    @Transactional
    public Cours deleteByReference(String ref) {
        return coursDao.deleteByReference(ref);
    }

    public List<Cours> findAll() {
        return coursDao.findAll();
    }

    public  int  save(Cours entity) {
        if (findByReference(entity.getReference())!=null)
            return  -1;
        if (enseignantService.findByReference(entity.getEnseignant().getReference())!=null){
            Enseignant enseignant = enseignantService.findByReference(entity.getEnseignant().getReference());
            entity.setEnseignant(enseignant);
            coursDao.save(entity);
            return  0;
        }
        return  -2;

    }

    public Cours findByLibelleAndEnseignant(String libelle, Enseignant ens) {
        return coursDao.findByLibelleAndEnseignant(libelle, ens);
    }

    @Autowired
    public CoursDao coursDao;
    @Autowired
    public EnseignantService enseignantService;
}
