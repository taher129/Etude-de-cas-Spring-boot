package tn.esprit.firstSBProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant {
    @Id
    private long idEtudiant;
    private String nom;
    private String prenom;
    private long cin;
    private String ecole;
    private Date dateNaissance;
}
