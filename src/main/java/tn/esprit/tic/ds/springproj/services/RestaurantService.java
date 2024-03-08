package tn.esprit.tic.ds.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.springproj.entities.ChaineRestauration;
import tn.esprit.tic.ds.springproj.entities.Restaurant;
import tn.esprit.tic.ds.springproj.repository.ChaineRestaurationRepository;
import tn.esprit.tic.ds.springproj.repository.MenuRepository;
import tn.esprit.tic.ds.springproj.repository.RestaurantRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class RestaurantService implements IRestaurantService {
    private final RestaurantRepository restaurantRepository;
    private final ChaineRestaurationRepository chainerestaurantRepository;
    private final MenuRepository menuRepository;

    @Override
    public List<RestaurantRepository> retrieveAllByChaineRestaurationDateCreationAndNbPlacesMax(LocalDate localDate, int nbPlacesMax) {
        return restaurantRepository.findAllByChaineRestaurationDateCreationLessThanAndNbPlacesMaxGreaterThan(localDate, nbPlacesMax);
    }
    public Restaurant affecterRestaurantAChaineRestauration(String nomRestaurant, String libelleChaine){
        ChaineRestauration chainerestaurant=chainerestaurantRepository.findByLibelle(libelleChaine);
        Restaurant restaurant=restaurantRepository.findByNom(nomRestaurant);
        restaurant.setChaineRestauration(chainerestaurant);
        restaurantRepository.save(restaurant);
        return restaurant;
    }

    @Override
    public Restaurant ajoutRestaurantEtMenuAssocie(Restaurant restaurant) {
        restaurant.getMenus().forEach(e->e.setPrixTotal(0.0f));

        return restaurantRepository.save(restaurant);
    }
}
