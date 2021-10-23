package com.shareexpenseexample.facadepattern;

public class Grocery implements Item{
	
	
	
	public Grocery() {
		super();
	}

	@Override
	public void showItem() {
		System.out.println("Grocery Item expense");
	}

}
