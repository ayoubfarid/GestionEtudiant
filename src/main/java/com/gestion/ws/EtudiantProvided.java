package com.gestion.ws;

import com.gestion.bean.Etudiant;
import com.gestion.service.EtudiantService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Optional;

@RestController
@RequestMapping("gestion-etudiant/etudiant")
public class EtudiantProvided {
    @GetMapping("/ref/{ref}")
    public Etudiant findByReference(@PathVariable String ref) {
        return etudiantService.findByReference(ref);
    }
    @GetMapping("/Id/{Id}")
    public Optional<Etudiant> findById(@PathVariable  Long Id ) {
        return etudiantService.findById(Id);
    }

    @DeleteMapping("/ref/{ref}")
    public Etudiant deleteByReference(@PathVariable String ref) {
        return etudiantService.deleteByReference(ref);
    }
    @PostMapping("/")
    public int save(@RequestBody  Etudiant entity) {
        return etudiantService.save(entity);
    }

    private EtudiantService etudiantService;
}
