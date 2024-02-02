package tn.spring4ds3.springproj.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DetailComposant")
public class DetailComposant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDetailComposant;
    private float imc;
    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;
}