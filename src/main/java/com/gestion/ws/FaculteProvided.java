package com.gestion.ws;

import com.gestion.bean.Faculte;
import com.gestion.service.FaculteService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("gestion-scolarite/faculte")
public class FaculteProvided {
    @DeleteMapping("ref/{Ref}")
    public Faculte deleteByReference(@PathVariable String Ref) {
        return faculteService.deleteByReference(Ref);
    }

    @PostMapping("/")
    public int save(@RequestBody Faculte entity) {
        return faculteService.save(entity);
    }

    @GetMapping("ref/{ref}")
    public Faculte findByReference( @PathVariable String ref) {
        return faculteService.findByReference(ref);
    }
    @GetMapping("libelle/{lib}")
    public Faculte findByLibelle(@PathVariable String lib) {
        return faculteService.findByLibelle(lib);
    }
    @GetMapping("/")
    public List<Faculte> findAll() {
        return faculteService.findAll();
    }

    private FaculteService faculteService;


}
