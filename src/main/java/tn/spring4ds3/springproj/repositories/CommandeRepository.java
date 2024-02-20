package tn.spring4ds3.springproj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring4ds3.springproj.entities.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande,Long> {

    List<Commande>  findAllByClientIdClient(Client client);
    List<Commande> findAllByClientIdClientAndDateCommandeBetween(Long clientId, LocalDate data1, LocalDate date2);
    List<Commande> findAllByDateCommandeBetweenOrderByNoteAsc(LocalDate dat1, LocalDate date2);
}
