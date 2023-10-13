package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.Attachment;
@RepositoryRestResource(path = "attachments")
public interface AttachmentRepository extends JpaRepository<Attachment,Long> {
}
