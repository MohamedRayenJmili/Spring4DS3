package tn.spring4ds3.springproj.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ChefCuisinier")
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChefCuisinier;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;
}