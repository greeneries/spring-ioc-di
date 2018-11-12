package com.example.ioc.step5;

import lombok.AllArgsConstructor; 
import lombok.Data;


public class Car {    
	private String name;

	public Car(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	} 
	
	
}