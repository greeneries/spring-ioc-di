package com.example.ioc.step5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


	/*
	 * spring에게 관계를 위임하는 방법
		- xml 파일로 하는 방법 : spring 2.X에서 도입
	 */
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		CarMaker maker = new KiaMaker(); // 객체 생성
//		HyundaiMaker maker = new HyundaiMaker(); // 객체 생성
//		
//		OrderManager manager = new OrderManager(); // 객체 생성
//		manager.setMaker(maker); // 관계 설정 
//		manager.order(); // 로직 호출 
		
		/*
		 * applicationcontext야 너가 관리하는 객체 중에 id가 manager인 객체를 나한테 줘 
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("car-config.xml");
		OrderManager manager = (OrderManager) context.getBean("manager");
		manager.order();

	}

}
