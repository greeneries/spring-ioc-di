package com.example.ioc.step2;

public class KiaMaker {
	public Car sell(Money money) {
		System.out.println("KiaMaker # " + money.getAmount() + "원을 차 값으로 받는다.");
		Car car = new Car("K9");
		System.out.println("KiaMaker # " + car.getName() + "를 만들어서 판다.");
		return car;
	}
}