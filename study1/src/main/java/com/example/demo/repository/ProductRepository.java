package com.example.demo.repository;

import com.example.demo.domain.imageObject;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;  // CRUD

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;
import java.io.File;
import java.util.List;

//@RequiredArgsConstructor  // final 이 붙어있거나 @NotNull 이 붙어있는 필드값에 생성자를 자동으로 생성한다.
@Repository  // @Repository 는 CRUD 를 한다.
public class ProductRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(imageObject product)
    {
        em.persist(product);
    }

}
