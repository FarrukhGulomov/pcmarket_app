package uz.pcmarket.online.domain.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.OrderDetails;
import uz.pcmarket.online.domain.entity.Product;

@Projection(types = OrderDetails.class)
public interface CustomOrderDetails {
    double getAmount();
    Product getProduct();

}
