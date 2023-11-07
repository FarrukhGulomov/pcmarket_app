package uz.pcmarket.online.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.pcmarket.online.domain.utils.AbsEntity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Property extends AbsEntity {

    @ManyToOne
    private Characteristic characteristic;

}
