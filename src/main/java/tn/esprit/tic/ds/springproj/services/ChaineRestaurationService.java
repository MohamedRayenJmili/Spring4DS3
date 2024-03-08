package tn.esprit.tic.ds.springproj.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tic.ds.springproj.repository.ChaineRestaurationRepository;
import tn.esprit.tic.ds.springproj.entities.Restaurant;
@Service
@AllArgsConstructor
public class ChaineRestaurationService implements IChaineRestaurationService {
    private final ChaineRestaurationRepository chaineRestaurationRepository;
}
