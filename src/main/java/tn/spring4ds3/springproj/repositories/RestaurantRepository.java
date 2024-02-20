package tn.spring4ds3.springproj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring4ds3.springproj.entities.Client;
import tn.spring4ds3.springproj.entities.Restaurant;

import java.time.LocalDate;
import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    List<Restaurant> findAllByNbPlacesMaxGreaterThanAndChaineRestauration_DateCreationBefore(Long capacite, LocalDate dateCreation);

}
