package tn.spring4ds3.springproj.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private LocalDate dateCommande;
    private int pourcentageRmise;
    private float totalRmise;
    private float totalCommande;
    private long note;
    @ManyToOne
     Client client;
    @ManyToOne
     Menu menu;
}

