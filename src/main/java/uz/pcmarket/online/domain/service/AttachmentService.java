package uz.pcmarket.online.domain.service;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import uz.pcmarket.online.domain.entity.Attachment;
import uz.pcmarket.online.domain.entity.AttachmentContent;
import uz.pcmarket.online.domain.repository.AttachmentContentRepository;
import uz.pcmarket.online.domain.repository.AttachmentRepository;

import java.io.IOException;
import java.util.Optional;

@Service
public class AttachmentService {

    AttachmentRepository attachmentRepository;
    AttachmentContentRepository attachmentContentRepository;

    @Autowired
    public AttachmentService(AttachmentRepository attachmentRepository, AttachmentContentRepository attachmentContentRepository) {
        this.attachmentRepository = attachmentRepository;
        this.attachmentContentRepository = attachmentContentRepository;
    }
    public HttpEntity<?> uploadPhoto(MultipartFile file){
        Attachment attachment=new Attachment();
        AttachmentContent attachmentContent=new AttachmentContent();
        try {
            attachment.setName(file.getName());
            attachment.setSize(file.getSize());
            attachment.setContentType(file.getContentType());
            Attachment savedAttachment = attachmentRepository.save(attachment);

            attachmentContent.setAttachment(savedAttachment);
            attachmentContent.setBytes(file.getBytes());
            attachmentContentRepository.save(attachmentContent);
            return ResponseEntity.ok("Successfully added!");
        } catch (IOException e) {
            return ResponseEntity.ok("Error!");
        }

    }
    public void downloadPhoto(HttpServletResponse response,Long id){
        Optional<Attachment> optionalAttachment = attachmentRepository.findById(id);
        if(optionalAttachment.isPresent()) {
            Attachment attachment = optionalAttachment.get();
            Optional<AttachmentContent> optionalContent = attachmentContentRepository.findByAttachmentId(id);
            if(optionalContent.isPresent()){
                AttachmentContent attachmentContent = optionalContent.get();
                response.setContentType(attachment.getContentType());
                System.out.println(attachment.getContentType());
                response.setHeader("Content-Disposition","attachment; fileName=\""
                        +attachment.getName()+"\"");
                try {
                    FileCopyUtils.copy(attachmentContent.getBytes(),response.getOutputStream());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        }
}
