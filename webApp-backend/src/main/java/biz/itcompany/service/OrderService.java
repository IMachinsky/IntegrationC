package biz.itcompany.service;

import biz.itcompany.model.Client;
import biz.itcompany.model.Order;
import biz.itcompany.model.Worker;
import biz.itcompany.repository.ClientRepository;
import biz.itcompany.repository.OrderRepository;
import biz.itcompany.repository.WorkerRepository;
import biz.itcompany.view.OrderView;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private WorkerRepository workerRepository;
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private OrderRepository orderRepository;

    public List<OrderView> getAll(){
        List<Order> orderList = orderRepository.findAll();
        List<OrderView> orderViewList = new ArrayList<>();
        orderList.forEach(order -> {
            OrderView orderView = new OrderView();
            BeanUtils.copyProperties(order, orderView);
            Worker worker = workerRepository.getOne(order.getWorkerId());
            Client client = clientRepository.getOne(order.getClientId());
            orderView.setWorkerLastName(worker.getWorkerLastName());
            orderView.setWorkerName(worker.getWorkerName());
            orderView.setWorkerMiddleName(worker.getWorkerMiddleName());
            orderView.setClientCompanyName(client.getClientCompanyName());
            orderViewList.add(orderView);
        });
        return orderViewList;
    }

    public OrderView getOne(Integer id){
        Order order = orderRepository.getOne(id);
        OrderView orderView = new OrderView();
        BeanUtils.copyProperties(order, orderView);
        Worker worker = workerRepository.getOne(order.getWorkerId());
        Client client = clientRepository.getOne(order.getClientId());
        orderView.setWorkerName(worker.getWorkerName());
        orderView.setWorkerLastName(worker.getWorkerLastName());
        orderView.setWorkerMiddleName(worker.getWorkerMiddleName());
        orderView.setClientCompanyName(client.getClientCompanyName());
        return orderView;
    }

    public void save(OrderView orderView){
        Order order = new Order();
        BeanUtils.copyProperties(orderView, order);
        orderRepository.save(order);
    }

    public void deleteById(Integer id){
        orderRepository.deleteById(id);
    }

}
