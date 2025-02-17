package tn.esprit.firstSBProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstSBProject.Entity.Foyer;
import tn.esprit.firstSBProject.Repository.FoyerRepository;

import java.util.List;

@Service
public class FoyerService {
    @Autowired
    private FoyerRepository foyerRepository;

    public Foyer saveFoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    public Foyer getFoyerById(Long id) {
        return foyerRepository.findById(id).orElse(null);
    }

    public void deleteFoyer(Long id) {
        foyerRepository.deleteById(id);
    }
}
