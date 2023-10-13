package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import uz.pcmarket.online.domain.entity.Category;
import uz.pcmarket.online.domain.projection.CategoryInfo;

@RepositoryRestResource(path = "categories",collectionResourceRel = "categoryInfo",excerptProjection = CategoryInfo.class)
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
