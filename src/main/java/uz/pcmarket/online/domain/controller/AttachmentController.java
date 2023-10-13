package uz.pcmarket.online.domain.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import uz.pcmarket.online.domain.service.AttachmentService;

@RepositoryRestController
public class AttachmentController {
    AttachmentService attachmentService;

    @Autowired
    public AttachmentController(AttachmentService attachmentService) {
        this.attachmentService = attachmentService;
    }
    @PostMapping(value = "attachments/uploadPhoto")
    public HttpEntity<?> uploadPhoto(@RequestPart MultipartFile file){
        return attachmentService.uploadPhoto(file);
    }
    @GetMapping("attachments/download/{id}")
    public void getPhoto(@PathVariable Long id, HttpServletResponse response){
        attachmentService.downloadPhoto(response,id);
    }
}
