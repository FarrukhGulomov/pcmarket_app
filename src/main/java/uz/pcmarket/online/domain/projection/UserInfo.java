package uz.pcmarket.online.domain.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.online.domain.entity.Bucket;
import uz.pcmarket.online.domain.entity.User;
import uz.pcmarket.online.domain.entity.enums.Role;

@Projection(types = User.class)
public interface UserInfo {

    Long getId();

    String getFullName();
    String getUsername();

    String getAddress();

    String getPhone();

    String getEmail();

    Role getRole();

    Bucket getBucket();

}
