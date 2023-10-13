package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.User;
import uz.pcmarket.online.domain.projection.UserInfo;

@RepositoryRestResource(path = "users",excerptProjection = UserInfo.class,collectionResourceRel = "userInfo")
public interface UserRepository extends JpaRepository<User,Long> {
}
