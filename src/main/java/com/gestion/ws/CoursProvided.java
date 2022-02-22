package com.gestion.ws;

import com.gestion.bean.Cours;
import com.gestion.bean.Enseignant;
import com.gestion.service.CoursService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("gestion-scolarite/cours")
public class CoursProvided {
    @GetMapping("/ref/{ref}")
    public Cours findByReference(@PathVariable String ref) {
        return coursService.findByReference(ref);
    }

    @DeleteMapping ("/ref/{ref}")
    public Cours deleteByReference(@PathVariable String ref) {
        return coursService.deleteByReference(ref);
    }
    @GetMapping("/")
    public List<Cours> findAll() {
        return coursService.findAll();
    }
    @PostMapping ("/")
    public int save(@RequestBody  Cours entity) {
        return coursService.save(entity);
    }
    @PostMapping("/libelle/{libelle}")
    public Cours findByLibelleAndEnseignant(@PathVariable String libelle, @RequestBody Enseignant ens) {
        return coursService.findByLibelleAndEnseignant(libelle, ens);
    }

    public CoursService coursService;

}
