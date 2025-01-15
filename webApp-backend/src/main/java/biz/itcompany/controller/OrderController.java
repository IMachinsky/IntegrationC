package biz.itcompany.controller;

import biz.itcompany.model.Client;
import biz.itcompany.model.Order;
import biz.itcompany.service.ClientService;
import biz.itcompany.service.OrderService;
import biz.itcompany.view.OrderView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value ="/getlist")
    @CrossOrigin
    public List<OrderView> getList(){
        return orderService.getAll();
    }

    @PostMapping(value ="/get")
    @CrossOrigin
    public OrderView get(@RequestBody String id){
        return orderService.getOne(Integer.parseInt(id));
    }

    @PutMapping("/update")
    @CrossOrigin
    public OrderView updateClient(@RequestBody OrderView orderView) {
        orderService.save(orderView);
        return orderView;
    }

    @DeleteMapping("/delete")
    @CrossOrigin
    public void deleteClient(@RequestBody String id) {
        orderService.deleteById(Integer.parseInt(id));
    }
}
