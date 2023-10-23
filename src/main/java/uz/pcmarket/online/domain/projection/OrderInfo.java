package uz.pcmarket.online.domain.projection;

import jakarta.persistence.*;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import org.springframework.format.annotation.DateTimeFormat;
import uz.pcmarket.online.domain.entity.Order;
import uz.pcmarket.online.domain.entity.OrderDetails;
import uz.pcmarket.online.domain.entity.User;
import uz.pcmarket.online.domain.entity.enums.Currency;
import uz.pcmarket.online.domain.entity.enums.OrderStatus;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Projection(types = Order.class)
public interface OrderInfo {
    Long getId();

    User getUser();

    Double getTotal();

    OrderStatus getOrderStatus();

    Timestamp getCreatedDate();

    List<OrderDetails> getOrderDetails();

    @Value("#{target.currency.name()}")
    String getCurrency();
}
