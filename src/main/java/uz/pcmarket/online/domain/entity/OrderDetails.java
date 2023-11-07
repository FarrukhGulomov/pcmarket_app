package uz.pcmarket.online.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pcmarket.online.domain.entity.enums.Currency;
import uz.pcmarket.online.domain.entity.enums.Measurement;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    @Transient
    private Measurement measurement = Measurement.QUANTITY;
    @Transient
    private Currency currency = Currency.UZS;

}
