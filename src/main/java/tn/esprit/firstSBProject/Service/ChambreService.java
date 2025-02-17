package tn.esprit.firstSBProject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.firstSBProject.Entity.Chambre;
import tn.esprit.firstSBProject.Repository.ChambreRepository;

import java.util.List;

@Service
public class ChambreService {
    @Autowired
    private ChambreRepository chambreRepository;

    public Chambre saveChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    public Chambre getChambreById(Long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }
}
