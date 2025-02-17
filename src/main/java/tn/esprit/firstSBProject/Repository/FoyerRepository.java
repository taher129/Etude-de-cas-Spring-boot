package tn.esprit.firstSBProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstSBProject.Entity.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}
