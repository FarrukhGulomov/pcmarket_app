package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Warehouse;
import uz.pcmarket.online.domain.projection.WarehouseInfo;

@RepositoryRestResource(path = "warehouses",excerptProjection = WarehouseInfo.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Long> {
}
