package uz.pcmarket.online.domain.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Order;
import uz.pcmarket.online.domain.entity.Product;
import uz.pcmarket.online.domain.entity.User;
import uz.pcmarket.online.domain.entity.enums.OrderStatus;

import java.sql.Timestamp;
import java.util.List;

@Projection(types = Order.class)
public interface OrderInfo {
    Long getId();

    User getUser();

    Double getTotal();

    OrderStatus getOrderStatus();

    List<Product> getProductList();
Double getAmount();
    Timestamp getCreatedDate();

    @Value("#{target.currency.name()}")
    String getCurrency();
}
