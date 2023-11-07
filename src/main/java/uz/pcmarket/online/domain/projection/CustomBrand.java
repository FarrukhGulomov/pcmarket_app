package uz.pcmarket.online.domain.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Brand;
import uz.pcmarket.online.domain.projection.template.GeneralInfo;

@Projection(types = Brand.class)
public interface CustomBrand extends GeneralInfo {
}
