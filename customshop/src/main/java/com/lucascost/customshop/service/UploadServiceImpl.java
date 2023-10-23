package com.lucascost.customshop.service;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class UploadServiceImpl implements IUploadService{
    @Override
    public String uploadFile(MultipartFile arquivo) {
        try {
            System.out.println("DEBUG - FILENAME" + arquivo.getOriginalFilename());
            return arquivo.getOriginalFilename();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
