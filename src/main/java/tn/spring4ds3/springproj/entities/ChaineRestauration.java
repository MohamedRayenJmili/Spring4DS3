package tn.spring4ds3.springproj.entities;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name = "ChaineRestauration")
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChaineRestauration;
    private String libelle;
    private LocalDate dateCreation;
}