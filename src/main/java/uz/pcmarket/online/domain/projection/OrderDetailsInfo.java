package uz.pcmarket.online.domain.projection;

import jakarta.persistence.*;
import lombok.Builder;
import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Order;
import uz.pcmarket.online.domain.entity.OrderDetails;
import uz.pcmarket.online.domain.entity.Product;
import uz.pcmarket.online.domain.entity.enums.Measurement;

@Projection(types = OrderDetails.class)
public interface OrderDetailsInfo {
    Long getId();

    Product getProduct();

    Double getAmount();

    Measurement getMeasurement();

    Order getOrder();

}
