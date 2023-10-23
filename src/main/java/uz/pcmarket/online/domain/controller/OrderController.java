package uz.pcmarket.online.domain.controller;

import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.pcmarket.online.domain.entity.Order;
import uz.pcmarket.online.domain.service.OrderService;

@RepositoryRestController(path ="calculateTotal" )
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping
    public Double getTotal(@RequestBody Order order){
        return orderService.getTotalOrderAmount(order);
    }
}
