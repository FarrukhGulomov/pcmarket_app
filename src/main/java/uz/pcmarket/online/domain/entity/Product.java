package uz.pcmarket.online.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.pcmarket.online.domain.entity.enums.PaymentType;
import uz.pcmarket.online.domain.utils.AbsEntity;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "product")
public class Product extends AbsEntity {

    private String description;
    private Double price = 0D;
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Category category;

    private Integer guarantee;
    @ManyToOne
    private Brand brand;

    @OneToMany
    private List<Attachment> photos;

    @Transient
    private PaymentType paymentType=PaymentType.CASH;
}

