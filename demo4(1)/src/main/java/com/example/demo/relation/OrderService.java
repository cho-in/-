package com.example.demo.relation;


import com.example.demo.relation.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void insert(Member member)
    {
        orderRepository.insert(member);
    }

}
