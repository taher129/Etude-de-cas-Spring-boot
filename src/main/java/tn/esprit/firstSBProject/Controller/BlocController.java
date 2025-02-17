package tn.esprit.firstSBProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.firstSBProject.Entity.Bloc;
import tn.esprit.firstSBProject.Service.BlocService;

import java.util.List;

@RestController
@RequestMapping("/blocs")
public class BlocController {
    @Autowired
    private BlocService blocService;

    @PostMapping
    public Bloc createBloc(@RequestBody Bloc bloc) {
        return blocService.saveBloc(bloc);
    }

    @GetMapping
    public List<Bloc> getAllBlocs() {
        return blocService.getAllBlocs();
    }

    @GetMapping("/{id}")
    public Bloc getBlocById(@PathVariable Long id) {
        return blocService.getBlocById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBloc(@PathVariable Long id) {
        blocService.deleteBloc(id);
    }
}
