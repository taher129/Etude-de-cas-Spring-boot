package tn.esprit.firstSBProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstSBProject.Entity.Chambre;
import tn.esprit.firstSBProject.Service.ChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambres")
public class ChambreController {
    @Autowired
    private ChambreService chambreService;

    @PostMapping
    public Chambre createChambre(@RequestBody Chambre chambre) {
        return chambreService.saveChambre(chambre);
    }

    @GetMapping
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambres();
    }

    @GetMapping("/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return chambreService.getChambreById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
    }
}
