package uz.pcmarket.online.domain.entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;
import uz.pcmarket.online.domain.entity.enums.Currency;
import uz.pcmarket.online.domain.entity.enums.Measurement;
import uz.pcmarket.online.domain.entity.enums.OrderStatus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    private User user;
    @Getter(AccessLevel.NONE)
    @Setter
    private Double total=0D;


    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.NEW;

    @Builder.Default
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp createdDate = Timestamp.valueOf(LocalDateTime.now());


    @ManyToMany
    private List<OrderDetails> orderDetailsList;


    public Double getTotal() {

        for (OrderDetails orderDetails : orderDetailsList) {
        total+= orderDetails.getProduct().getPrice()*orderDetails.getAmount();
        }
        return total;
    }


}

//for postgres but this is not best way
//    CREATE FUNCTION get_total() RETURNS DOUBLE PRECISION AS $$
//    BEGIN
//    RETURN (SELECT COALESCE(SUM(p.price * od.amount), 0) FROM order_details od JOIN product p ON od.product_id = p.id WHERE od.order_id = id);
//        END;
//        $$ LANGUAGE plpgsql;