package com.gestion.ws;

import com.gestion.bean.Enseignant;
import com.gestion.service.EnseignantService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("gestion-scolarite/enseignant")
public class EnseignantProvided {
    @GetMapping("/ref/{Ref}")
    public Enseignant findByReference(@PathVariable  String Ref) {
        return enseignantService.findByReference(Ref);
    }
    @GetMapping("/grade/{grade}")
    public List<Enseignant> findByGrade(@PathVariable String grade) {
        return enseignantService.findByGrade(grade);
    }

    @DeleteMapping("/ref/{ref}")
    public Enseignant deleteByReference(@PathVariable String ref) {
        return enseignantService.deleteByReference(ref);
    }
    @GetMapping("/")
    public List<Enseignant> findAll() {
        return enseignantService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody  Enseignant entity) {
        return enseignantService.save(entity);
    }

    public EnseignantService enseignantService;


}
