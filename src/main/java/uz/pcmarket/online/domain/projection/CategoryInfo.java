package uz.pcmarket.online.domain.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Category;
import uz.pcmarket.online.domain.projection.template.GeneralInfo;

@Projection(types = Category.class)
public interface CategoryInfo extends GeneralInfo {

}
