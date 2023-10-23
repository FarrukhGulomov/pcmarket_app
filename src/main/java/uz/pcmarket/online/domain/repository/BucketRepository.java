package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Bucket;
import uz.pcmarket.online.domain.projection.BucketInfo;

@RepositoryRestResource(path = "buckets",collectionResourceRel = "bucketInfo",excerptProjection = BucketInfo.class)
public interface BucketRepository extends JpaRepository<Bucket,Long> {
}
