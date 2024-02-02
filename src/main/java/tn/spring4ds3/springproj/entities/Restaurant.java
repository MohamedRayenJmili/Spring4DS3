package tn.spring4ds3.springproj.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRestaurant;
    private String nom;
    private long nbPlaceMax;
}
