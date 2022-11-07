package com.example.demo.controller;

import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@RequiredArgsConstructor
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("addProduct")   // view 를 뿌려준다.
    public String addProduct()
    {
        return "addProduct";
    }
    @PostMapping("addProduct")   // view 를 뿌려준다.
    public String addImage(MultipartFile file) throws Exception
    {
        productService.save(file);
        return "redirect:/";
    }
}
