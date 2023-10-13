package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Address;
import uz.pcmarket.online.domain.projection.AddressInfo;

@RepositoryRestResource(path = "addresses",excerptProjection = AddressInfo.class)
public interface AddressRepository extends JpaRepository<Address,Long> {
}
