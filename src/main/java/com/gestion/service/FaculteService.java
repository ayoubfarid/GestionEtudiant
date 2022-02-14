package com.gestion.service;

import com.gestion.bean.Faculte;
import com.gestion.dao.FaculteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class FaculteService {
    @Transactional
    public Faculte deleteByReference(String Ref) {
        return faculteDao.deleteByReference(Ref);
    }
    public  int save(Faculte entity) {
        if (findByReference(entity.getReference()) != null)
            return -1;
        faculteDao.save(entity);
        return 0;
    }

    public Faculte findByReference(String Ref) {
        return faculteDao.findByReference(Ref);
    }

    public Faculte findByLibelle(String Lib) {
        return faculteDao.findByLibelle(Lib);
    }

    public List<Faculte> findAll() {
        return faculteDao.findAll();
    }

    @Autowired
    private FaculteDao faculteDao;

}
