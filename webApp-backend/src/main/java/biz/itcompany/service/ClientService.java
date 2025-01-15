package biz.itcompany.service;

import biz.itcompany.model.Client;
import biz.itcompany.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.findAll();
    }

    public Client get(Integer id){
        return clientRepository.findById(id).get();
    }

    public void save(Client client){
        clientRepository.save(client);
    }

    public void delete(Integer id){
        clientRepository.deleteById(id);
    }
}
