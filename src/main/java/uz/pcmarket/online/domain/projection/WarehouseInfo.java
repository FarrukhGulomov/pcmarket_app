package uz.pcmarket.online.domain.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Product;
import uz.pcmarket.online.domain.entity.Warehouse;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Projection(types = Warehouse.class)
public interface WarehouseInfo {
    Long getId();
    String getName();
    Product getProduct();
    BigDecimal getAmount();
    Timestamp getInputDate();
    @Value("#{target.measurement.getTranslationEn()}")
    String getMeasurement();

}
