package com.gestion.service;

import com.gestion.bean.Enseignant;
import com.gestion.dao.EnseignantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EnseignantService {
    public Enseignant findByReference(String Ref) {
        return enseignantDao.findByReference(Ref);
    }

    public List<Enseignant> findByGrade(String grade) {
        return enseignantDao.findByGrade(grade);
    }
    @Transactional
    public Enseignant deleteByReference(String ref) {
        return enseignantDao.deleteByReference(ref);
    }

    public List<Enseignant> findAll() {
        return enseignantDao.findAll();
    }

    public int  save(Enseignant entity) {
        if(findByReference(entity.getReference())!=null)
            return  -1;
        enseignantDao.save(entity);
        return 0;
    }

    @Autowired
    public EnseignantDao enseignantDao;

}
