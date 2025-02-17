package tn.esprit.firstSBProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstSBProject.Entity.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
