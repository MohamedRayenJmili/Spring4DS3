package tn.spring4ds3.springproj.services;

import tn.spring4ds3.springproj.entities.Client;

import java.util.List;

public interface IClientService {
    List<Client> retrieveAllClients();
    Client addClient(Client e);
    Client updateClient(Client e);
    Client retrieveClient(Long idClient);
    void removeClient(Long idClient);
    List<Client> addClients (List<Client> Clients);
}
