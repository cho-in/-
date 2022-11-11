package com.example.demo.service;

import com.example.demo.domain.imageObject;
import com.example.demo.dto.ProductDto;
import com.example.demo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;
import java.io.File;
// import javax.transaction.Transactional;

@Transactional(readOnly = true)  // 읽기 전용.
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // 예외처리
    @Transactional
    public void save(MultipartFile file, ProductDto dto) throws Exception {

        String filePath = System.getProperty("user.dir")
                + "\\src\\name\\resources//static\\image";   // 파일 경로

        UUID uuid = UUID.randomUUID();
        String fileName = uuid + "_" + file.getOriginalFilename();  // 파일 이름

        File saved = new File(filePath, fileName);
        file.transferTo(saved);

        imageObject product = new imageObject(
                dto.getTitle(),
                dto.getContent(),
                dto.getCount(),
                dto.getPrice(),
                fileName, filePath);
        file.transferTo(saved);

        dto.setPrice(10);
        //productRepository.save(product);

    }
}