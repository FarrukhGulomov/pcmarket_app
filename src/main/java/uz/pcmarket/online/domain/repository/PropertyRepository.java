package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Property;
import uz.pcmarket.online.domain.projection.CustomProperty;

@RepositoryRestResource(path = "properties",collectionResourceRel = "PropertyInfo",excerptProjection = CustomProperty.class)
public interface PropertyRepository extends JpaRepository<Property,Long> {
}
