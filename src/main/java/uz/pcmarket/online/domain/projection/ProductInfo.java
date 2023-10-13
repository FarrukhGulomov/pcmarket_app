package uz.pcmarket.online.domain.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Attachment;
import uz.pcmarket.online.domain.entity.Category;
import uz.pcmarket.online.domain.entity.Product;
import uz.pcmarket.online.domain.entity.User;
import uz.pcmarket.online.domain.projection.template.GeneralInfo;

import java.math.BigDecimal;

//@Projection(types = Product.class)
public interface ProductInfo extends GeneralInfo {

    Category getCategory();
    Attachment getPhoto();
    BigDecimal getPrice();
}
