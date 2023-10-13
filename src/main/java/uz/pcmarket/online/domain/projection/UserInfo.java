package uz.pcmarket.online.domain.projection;

import jakarta.persistence.*;
import lombok.Builder;
import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Address;
import uz.pcmarket.online.domain.entity.User;
import uz.pcmarket.online.domain.utils.Role;

@Projection(types = User.class)
public interface UserInfo {

    Long getId();

    String getFullName();

    Address getAddress();

    String getPhone();

    String getEmail();

    Role getRole();

}
