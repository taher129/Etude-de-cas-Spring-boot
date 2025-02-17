package tn.esprit.firstSBProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstSBProject.Entity.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
