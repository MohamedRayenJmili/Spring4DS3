package tn.esprit.tic.ds.springproj.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tic.ds.springproj.entities.Restaurant;
import tn.esprit.tic.ds.springproj.repository.RestaurantRepository;
import tn.esprit.tic.ds.springproj.services.IRestaurantService;

import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/restaurant")
public class RestaurantController {
    private final IRestaurantService restaurantService;

    //    http://localhost:8089/restaurant/restaurant/find-all-restaurants
    @GetMapping("/find-all-restaurants/{localDate}/{nbPlacesMax}")
    public List<RestaurantRepository> findAllRestaurants(
            @PathVariable("localDate") LocalDate localDate,
            @PathVariable("nbPlacesMax") int nbPlacesMax) {
        List<RestaurantRepository> restaurants = restaurantService
                .retrieveAllByChaineRestaurationDateCreationAndNbPlacesMax(localDate, nbPlacesMax);
        return restaurants;
    }
    //    http://localhost:8089/restaurant/restaurant/findRestaurantWithChaineRestaurant
    @GetMapping("/findRestaurantWithChaineRestaurant/{nomRestaurant}/{libelleChaine}")
    public Restaurant findRestaurantWithChaineRestaurant
        (
            @PathVariable("nomRestaurant") String nomRestaurant,
            @PathVariable("libelleChaine") String libelleChaine) {
        return restaurantService.affecterRestaurantAChaineRestauration(nomRestaurant, libelleChaine);
    }
    //    http://localhost:8089/menu/restaurant/AddRestaurantWithItsMenus
    @PostMapping("/AddRestaurantWithItsMenus")
    public Restaurant AddRestaurantWithItsMenus
    (
            @RequestBody Restaurant restaurant
    ) {
        return restaurantService.ajoutRestaurantEtMenuAssocie(restaurant);
    }
}
