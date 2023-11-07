package uz.pcmarket.online.domain.projection;

import jakarta.persistence.GeneratedValue;
import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Characteristic;
import uz.pcmarket.online.domain.projection.template.GeneralInfo;

@Projection(types = Characteristic.class)
public interface CustomCharacteristic extends GeneralInfo {

}
