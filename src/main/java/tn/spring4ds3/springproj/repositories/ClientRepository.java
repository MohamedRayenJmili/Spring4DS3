package tn.spring4ds3.springproj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring4ds3.springproj.entities.*;

import java.util.Date;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long> {
    List<Client> findByCommandes(Long idClient);
}
