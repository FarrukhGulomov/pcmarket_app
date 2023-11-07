package uz.pcmarket.online.domain.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Characteristic;
import uz.pcmarket.online.domain.entity.Property;
import uz.pcmarket.online.domain.projection.template.GeneralInfo;

@Projection(types = Property.class)
public interface CustomProperty extends GeneralInfo {
    Characteristic getCharacteristic();
}
