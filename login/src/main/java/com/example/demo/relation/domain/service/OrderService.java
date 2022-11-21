package com.example.demo.relation.service;


import com.example.demo.relation.member.Member;
import com.example.demo.relation.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public void insert(Member member)
    {
        orderRepository.insert(member);
    }

}
