package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.OrderDetails;
import uz.pcmarket.online.domain.projection.CustomOrderDetails;

@RepositoryRestResource(path = "orderDetails",excerptProjection = CustomOrderDetails.class)
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Long> {
}
