package uz.pcmarket.online.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import uz.pcmarket.online.domain.utils.AbsEntity;
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category extends AbsEntity {

    @ManyToOne(optional = true)
    private Category parentCategory;

}
