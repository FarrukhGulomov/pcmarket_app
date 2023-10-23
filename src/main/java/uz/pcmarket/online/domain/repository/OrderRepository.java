package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Order;
import uz.pcmarket.online.domain.entity.OrderDetails;
import uz.pcmarket.online.domain.entity.User;
import uz.pcmarket.online.domain.projection.OrderInfo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RepositoryRestResource(path = "orders",collectionResourceRel = "orderInfo",excerptProjection = OrderInfo.class)
public interface OrderRepository extends JpaRepository<Order,Long> {

@Query(value = "SELECT SUM(od.amount*p.price) FROM OrderDetails od JOIN od.product p WHERE od.order = :order")
    Double calculateOrderTotal(Order order);
}
