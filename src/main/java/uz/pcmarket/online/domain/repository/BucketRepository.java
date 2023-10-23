package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Bucket;
@RepositoryRestResource(path = "buckets")
public interface BucketRepository extends JpaRepository<Bucket,Long> {
}
