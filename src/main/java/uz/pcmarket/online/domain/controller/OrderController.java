package uz.pcmarket.online.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.pcmarket.online.domain.dto.OrderDto;
import uz.pcmarket.online.domain.entity.Order;
import uz.pcmarket.online.domain.service.OrderService;

//@RepositoryRestController(path ="calculateTotal" )
@RepositoryRestController
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping("orders/add")
    public ResponseEntity<?> addOrder(@RequestBody OrderDto orderDto){
        return orderService.addOrder(orderDto);
    }
    @GetMapping("orders/getByPage")
    public ResponseEntity<?> getOrderPage(@RequestParam int pageNumber,@RequestParam int pageSize){
        return orderService.getOrdersByPage(pageNumber,pageSize);
    }

}
