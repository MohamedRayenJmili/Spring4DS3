package tn.spring4ds3.springproj.entities;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "Menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private float libelleMenu;
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;
    private float prixTotale;
    @ManyToMany
    private ArrayList<ChefCuisinier> chefCuisinier;
    @OneToMany(mappedBy = "menu")
    private ArrayList<Commande> commandes;
    @OneToMany(mappedBy = "menu")
    private ArrayList<Composant> composants;
}