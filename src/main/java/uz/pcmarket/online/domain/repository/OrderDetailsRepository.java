package uz.pcmarket.online.domain.repository;

import org.hibernate.annotations.Formula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import uz.pcmarket.online.domain.entity.OrderDetails;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RepositoryRestResource(path = "orderDetails")
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {
    @RestResource(path = "/calculateTotal")

    @Query(value = "SELECT SUM(od.amount * od.product.price) FROM OrderDetails od WHERE od.id IN :ids")
    Double calculateTotal(@Param("ids") List<Long> ids);

}
