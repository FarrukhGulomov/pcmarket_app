package uz.pcmarket.online.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.online.domain.entity.AttachmentContent;

import java.util.Optional;

@RepositoryRestResource(path = "attachmentContents")
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Long> {

    Optional<AttachmentContent> findByAttachmentId(Long attachment_id);
}
