package uz.pcmarket.online.domain.entity;

import jakarta.persistence.*;
import lombok.*;
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

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Category category;

    @OneToMany
    private List<Attachment> photos;

    @Builder.Default
    private BigDecimal price = BigDecimal.ZERO;


}

