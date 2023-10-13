package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Product;
import uz.pcmarket.online.domain.projection.ProductInfo;

@RepositoryRestResource(path = "products",collectionResourceRel = "productInfo")
public interface ProductRepository extends JpaRepository<Product,Long> {
}
