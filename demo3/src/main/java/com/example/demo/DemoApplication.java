package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://github.com/WinSpoon/springboot.git
// 영구적으로 속성인 상태 영속성 그와 반대인 비영속성. 영속성을 빠져나오면 준영속성 상태.
@SpringBootApplication  // 출발지점
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);   // 메인 실행 장소.
	}
}

// ** 회원관리
// * 회원가입  C
// * 회원정보 변경 R
// * 회원정보 조회 U
// * 회원정보 삭제 D

// ** 상품관리
// * 상품 등록
// * 상품 조회
// * 상품정보 변경
// * 상품 삭제

// ** 주문관리
// * 주문
// * 주문 조회
// * 주문 변경
// * 주문 취소

// ** 배송관리
// * 배송 시작
// * 배송 조회
// * 주문 취소 및 배송 철회