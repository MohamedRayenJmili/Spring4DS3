package tn.spring4ds3.springproj.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMenu;
    private float libelleMenu;
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;
    private float prixTotale;
}