package uz.pcmarket.online.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.pcmarket.online.domain.entity.enums.Currency;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "buckets")
public class Bucket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(nullable = false)
    @Getter(AccessLevel.NONE)
    private Double total = 0D;


    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name ="user_id")
    private User user;

    @OneToMany
    private List<OrderDetails> orderDetailsList;


    @Column(nullable = false)
    private boolean active = true;

    @Transient
    private Currency currency=Currency.UZS;

    public Double getTotal() {

        for (OrderDetails orderDetails : orderDetailsList) {
            this.total+= orderDetails.getProduct().getPrice();
        }
        return total;
    }
}
