package uz.pcmarket.online.domain.projection;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Transient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.*;
import uz.pcmarket.online.domain.entity.enums.PaymentType;
import uz.pcmarket.online.domain.projection.template.GeneralInfo;

import java.math.BigDecimal;
import java.util.List;

//@Projection(types = Product.class)
public interface ProductInfo extends GeneralInfo {

    Category getCategory();

    Double getPrice();

    String getDescription();

    Integer getGuarantee();

    Brand getBrand();

    List<Attachment> getPhotos();

    PaymentType getPaymentType();
}
