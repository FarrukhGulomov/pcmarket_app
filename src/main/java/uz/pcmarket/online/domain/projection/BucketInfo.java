package uz.pcmarket.online.domain.projection;

import jakarta.persistence.*;
import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Bucket;
import uz.pcmarket.online.domain.entity.OrderDetails;
import uz.pcmarket.online.domain.entity.User;
import uz.pcmarket.online.domain.entity.enums.Currency;

import java.util.List;

@Projection(types = Bucket.class)
public interface BucketInfo {
     Long getId();


   List<OrderDetails> getOrderDetails();

     Double getTotal();
     User getUser();

     Currency getCurrency();
}
