package tn.spring4ds3.springproj.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
private Long idClient;
private String identifiable;
@Temporal(TemporalType.DATE)
private Date datePremiereVisite;
@OneToMany(mappedBy = "client")
    private ArrayList<Commande> commandes;
}
