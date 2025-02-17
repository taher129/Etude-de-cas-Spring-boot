package tn.esprit.firstSBProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstSBProject.Entity.Universite;
import tn.esprit.firstSBProject.Service.UniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universites")
public class UniversiteController {
    @Autowired
    private UniversiteService universiteService;

    @PostMapping
    public Universite createUniversite(@RequestBody Universite universite) {
        return universiteService.saveUniversite(universite);
    }

    @GetMapping
    public List<Universite> getAllUniversites() {
        return universiteService.getAllUniversites();
    }

    @GetMapping("/{id}")
    public Universite getUniversiteById(@PathVariable Long id) {
        return universiteService.getUniversiteById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUniversite(@PathVariable Long id) {
        universiteService.deleteUniversite(id);
    }
}
