package com.shareexpenseexample.factorypattern;

public class Internet implements Item{
	
	
	
	public Internet() {
		super();
	}

	@Override
	public void showItem() {
		System.out.println("Internet expense");
	}
	

}
