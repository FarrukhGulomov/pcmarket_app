package uz.pcmarket.online.domain.entity;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import uz.pcmarket.online.domain.utils.AbsEntity;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
@Entity
public class Characteristic extends AbsEntity {

}
