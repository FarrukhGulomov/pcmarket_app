package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Brand;
import uz.pcmarket.online.domain.projection.CustomBrand;

@RepositoryRestResource(path = "brands",collectionResourceRel = "BrandInfo",excerptProjection = CustomBrand.class)
public interface BrandRepository extends JpaRepository<Brand,Long> {
}
