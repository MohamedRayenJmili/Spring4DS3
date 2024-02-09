package tn.spring4ds3.springproj.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Composant")
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idComposant;
    private String nomComposant;
    private float prix;
    @ManyToOne
    Menu menu;
    @OneToOne
    DetailComposant detailComposant;
}