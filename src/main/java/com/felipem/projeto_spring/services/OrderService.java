package com.felipem.projeto_spring.services;

import com.felipem.projeto_spring.entities.Order;
import com.felipem.projeto_spring.repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    //@Autowired
    private final OrderRepository repository;

    public OrderService(OrderRepository orderRepository) {
        this.repository = orderRepository;
    }
    public List<Order> findAll(){
        return repository.findAll();
    }
    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
