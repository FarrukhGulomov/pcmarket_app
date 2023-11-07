package uz.pcmarket.online.domain.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
   /* private final OrderRepository orderRepository;
    private final OrderDetailsRepository orderDetailsRepository;
    private final UserRepository userRepository;

    public OrderService(OrderRepository orderRepository, OrderDetailsRepository orderDetailsRepository, UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.orderDetailsRepository = orderDetailsRepository;
        this.userRepository = userRepository;
    }

    List<OrderDetails> orderDetailsList = new ArrayList<>();

    public ResponseEntity<?> addOrder(OrderDto orderDto) {
        Double total = 0D;

        Order order = new Order();
        for (Long orderDetailsId : orderDto.getOrderDetailsIds()) {
            Optional<OrderDetails> optionalOrderDetails = orderDetailsRepository.findById(orderDetailsId);
            if (optionalOrderDetails.isEmpty()) return ResponseEntity.ok("Id not found!");
            OrderDetails orderDetails = optionalOrderDetails.get();

            orderDetailsList.add(orderDetails);
            total += orderDetails.getProduct().getPrice();
        }
        order.setTotal(total);
        Optional<User> optionalUser = userRepository.findById(orderDto.getUserId());
        if (optionalUser.isEmpty()) return ResponseEntity.ok("Id not found!");
        order.setUser(optionalUser.get());
        order.setOrderDetails(orderDetailsList);
        orderRepository.save(order);
        return ResponseEntity.status(202).body("Successfully");


    }*/
}
