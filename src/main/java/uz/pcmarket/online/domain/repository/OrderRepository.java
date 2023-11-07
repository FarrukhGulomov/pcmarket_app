package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Order;
import uz.pcmarket.online.domain.projection.OrderInfo;

@RepositoryRestResource(path = "orders",collectionResourceRel = "orderInfo",excerptProjection = OrderInfo.class)
public interface OrderRepository extends JpaRepository<Order,Long> {


}
