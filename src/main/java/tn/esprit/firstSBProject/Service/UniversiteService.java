package tn.esprit.firstSBProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstSBProject.Entity.Universite;
import tn.esprit.firstSBProject.Repository.UniversiteRepository;

import java.util.List;

@Service
public class UniversiteService {
    @Autowired
    private UniversiteRepository universiteRepository;

    public Universite saveUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    public Universite getUniversiteById(Long id) {
        return universiteRepository.findById(id).orElse(null);
    }

    public void deleteUniversite(Long id) {
        universiteRepository.deleteById(id);
    }
}
