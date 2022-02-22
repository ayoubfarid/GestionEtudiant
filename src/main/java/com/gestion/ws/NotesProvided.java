package com.gestion.ws;

import com.gestion.bean.Cours;
import com.gestion.bean.Etudiant;
import com.gestion.bean.Notes;
import com.gestion.service.NotesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gestion-scolarite/notes")
public class NotesProvided {
    @GetMapping("/etudiant/{refEtu}/cours/{refCrs}")
    public Notes findByEtudiantAndCours(@PathVariable String refEtu, @PathVariable String refCrs) {
        return notesService.findByEtudiantReferenceAndCoursReference(refEtu, refCrs);
    }
    @GetMapping("/etudiant/{refEtu}")
    public List<Notes> findByEtudiantReference(@PathVariable String refEtu) {
        return notesService.findByEtudiantReference(refEtu);
    }
    @GetMapping("/cours/{refCrs}")
    public List<Notes> findByCoursReference(@PathVariable String refCrs) {
        return notesService.findByCoursReference(refCrs);
    }
    @PostMapping("/")
    public int save(@RequestBody Notes entity) {
        return notesService.save(entity);
    }

    public NotesService notesService;
}
