package uz.pcmarket.online.domain.projection;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Product;
import uz.pcmarket.online.domain.entity.Review;

import java.time.LocalDateTime;

@Projection(types = Review.class)
public interface CustomReview {
     String getFullName();
     Integer getRating();
     String getComment();

     LocalDateTime getCreationDate();

     Product getProduct();
}
