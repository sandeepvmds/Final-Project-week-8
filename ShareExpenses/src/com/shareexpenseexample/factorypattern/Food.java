package com.shareexpenseexample.factorypattern;

public class Food implements Item{
	
	
	
	public Food() {
		super();
	}

	@Override
	public void showItem() {
		System.out.println("Food item expense");
	}

}
