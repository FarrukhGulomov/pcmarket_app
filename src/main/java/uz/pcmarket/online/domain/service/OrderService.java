package uz.pcmarket.online.domain.service;

import org.springframework.stereotype.Service;
import uz.pcmarket.online.domain.entity.Order;
import uz.pcmarket.online.domain.repository.OrderRepository;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public Double getTotalOrderAmount(Order order){
        return orderRepository.calculateOrderTotal(order);
    }
}
