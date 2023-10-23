package uz.pcmarket.online.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.pcmarket.online.domain.entity.enums.Measurement;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Product product;

    private Double amount;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private Measurement measurement = Measurement.QUANTITY;

    @ManyToOne
    private Order order;

}
