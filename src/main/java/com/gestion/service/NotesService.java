package com.gestion.service;

import com.gestion.bean.Cours;
import com.gestion.bean.Etudiant;
import com.gestion.bean.Notes;
import com.gestion.dao.NotesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {
    public Notes findByEtudiantReferenceAndCoursReference(String etudiantRef, String coursRef) {
        return notesDao.findByEtudiantReferenceAndCoursReference(etudiantRef,coursRef);
    }

    public List<Notes> findByEtudiantReference(String etudiantRef) {
        return notesDao.findByEtudiantReference(etudiantRef);
    }

    public List<Notes> findByCoursReference(String coursRef) {
        return notesDao.findByCoursReference(coursRef);
    }

    public  int save(Notes entity) {
        if (findByEtudiantReferenceAndCoursReference(entity.getEtudiant().getReference(),entity.getCours().getReference())!=null)
        return -1;
        if ((etudiantService.findByReference(entity.getEtudiant().getReference())!=null)&& (coursService.findByReference(entity.getCours().getReference())!=null))
        {
            Etudiant etudiant = etudiantService.findByReference(entity.getEtudiant().getReference());
            entity.setEtudiant(etudiant);
            Cours cours = coursService.findByReference(entity.getCours().getReference());
            entity.setCours(cours);
            notesDao.save(entity);
            return 0;
        }

        return -2;
    }

    @Autowired
    public NotesDao notesDao;
    public EtudiantService etudiantService;
    public CoursService coursService;





}
