package biz.itcompany.controller;

import biz.itcompany.model.Client;
import biz.itcompany.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(value ="/getlist")
    @CrossOrigin
    public List<Client> getList(){
        return clientService.getAll();
    }

    @PostMapping(value ="/get")
    @CrossOrigin
    public Client get(@RequestBody String id){
        return clientService.get(Integer.parseInt(id));
    }

    @PutMapping("/update")
    @CrossOrigin
    public Client updateClient(@RequestBody Client client) {
        clientService.save(client);
        return client;
    }

    @DeleteMapping("/delete")
    @CrossOrigin
    public void deleteClient(@RequestBody String id) {
        clientService.delete(Integer.parseInt(id));
    }
}
