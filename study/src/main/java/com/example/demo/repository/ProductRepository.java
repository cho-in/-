package com.example.demo.repository;

import com.example.demo.domain.imageObject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;

@RequiredArgsConstructor  // final 이 붙어있거나 @NotNull 이 붙어있는 필드값에 생성자를 자동으로 생성한다.
@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(imageObject product){
        em.persist(product);
    }


}
