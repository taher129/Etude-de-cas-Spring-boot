package tn.esprit.firstSBProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstSBProject.Entity.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
