package tn.spring4ds3.springproj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.spring4ds3.springproj.entities.Client;
import tn.spring4ds3.springproj.entities.Menu;
import tn.spring4ds3.springproj.entities.TypeMenu;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    List<Menu> findByMenuTypeMenuAndPrixGreaterThan(TypeMenu type, double price);

}
