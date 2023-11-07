package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Review;
import uz.pcmarket.online.domain.projection.CustomReview;

@RepositoryRestResource(path = "reviews",excerptProjection = CustomReview.class)
public interface ReviewRepository extends JpaRepository<Review,Long> {
}
