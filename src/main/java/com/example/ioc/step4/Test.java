package com.example.ioc.step4;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderManager o = new OrderManager();
		o.setMaker(new KiaMaker());
		o.order();
	}

}
