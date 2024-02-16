package tn.spring4ds3.springproj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring4ds3.springproj.entities.*;

import java.util.Date;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande,Long> {

    List<Commande> findByClientIdClientAndDateCommandeBetween(Commande commande, Date startDate, Date endDate);
    List<Commande> findByCommandeDateCommandeBetweenOrderByNoteAsc(Date startDate, Date endDate);
}
