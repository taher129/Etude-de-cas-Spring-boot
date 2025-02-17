package tn.esprit.firstSBProject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChambre; // Fixed typo

    private long numeroChambre;

    @Enumerated(EnumType.STRING) // Ensures the enum is stored as a string in the database
    private TypeC typeC; // Use an enum instead of `Enumeration`
}
