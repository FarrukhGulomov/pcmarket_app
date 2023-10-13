package uz.pcmarket.online.domain.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Address;

@Projection(types = Address.class)
public interface AddressInfo {
    long getId();
    String getRegion();
    String getDistrict();
    String getStreet();
    String getBuildingNumber();
}
