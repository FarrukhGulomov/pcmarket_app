package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Characteristic;
import uz.pcmarket.online.domain.projection.CustomCharacteristic;

@RepositoryRestResource(path = "characteristics",excerptProjection = CustomCharacteristic.class)
public interface CharacteristicRepository extends JpaRepository<Characteristic,Long> {
}
