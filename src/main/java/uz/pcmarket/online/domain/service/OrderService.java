package uz.pcmarket.online.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.pcmarket.online.domain.dto.OrderDto;
import uz.pcmarket.online.domain.entity.Order;
import uz.pcmarket.online.domain.entity.OrderDetails;
import uz.pcmarket.online.domain.entity.User;
import uz.pcmarket.online.domain.repository.OrderDetailsRepository;
import uz.pcmarket.online.domain.repository.OrderRepository;
import uz.pcmarket.online.domain.repository.UserRepository;

import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderDetailsRepository orderDetailsRepository;
    private final UserRepository userRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, OrderDetailsRepository orderDetailsRepository, UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.orderDetailsRepository = orderDetailsRepository;
        this.userRepository = userRepository;
    }


    public ResponseEntity<?> addOrder(OrderDto orderDto){
        double total=0D;
        Order order=new Order();
        List<OrderDetails> orderDetailsList=new ArrayList<>();
        for (Long orderDetailsId : orderDto.getOrderDetailsIds()) {
            Optional<OrderDetails> optionalOrderDetails = orderDetailsRepository.findById(orderDetailsId);
            if(optionalOrderDetails.isEmpty()) return ResponseEntity.status(404).body("Order Details is not found by this id!");
            OrderDetails orderDetails=optionalOrderDetails.get();
           total+= orderDetails.getProduct().getPrice()*orderDetails.getAmount();
            orderDetailsList.add(optionalOrderDetails.get());
        }
        Optional<User> optionalUser = userRepository.findById(orderDto.getUserId());
        if(optionalUser.isEmpty()) return ResponseEntity.status(404).body("User is not found by this id!");

        order.setOrderDetailsList(orderDetailsList);
        order.setUser(optionalUser.get());
        order.setTotal(total);
        orderRepository.save(order);
        return ResponseEntity.status(202).body("Successfully");
    }
    public ResponseEntity<?> getOrdersByPage(int pageNumber,int pageSize){
        Pageable pageable=PageRequest.of(pageNumber,pageSize);
        Page<Order> orderPage = orderRepository.findAll(pageable);
        return ResponseEntity.status(202).body(orderPage);
    }
}
