package uz.pcmarket.online.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import uz.pcmarket.online.domain.utils.AbsEntity;
import uz.pcmarket.online.domain.utils.Measurement;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Builder
@Entity
@Table(name = "warehouse")
public class Warehouse extends AbsEntity {
    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;

    @Column(nullable = false)
    @Builder.Default
    private BigDecimal amount = BigDecimal.ZERO;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp inputDate;

    @Builder.Default
    private Measurement measurement = Measurement.QUANTITY;

}
