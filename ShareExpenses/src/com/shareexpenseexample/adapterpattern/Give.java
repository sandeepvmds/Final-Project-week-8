package com.shareexpenseexample.adapterpattern;

public class Give implements GroupExpense{

	@Override
	public void give(String amount, String expensename) {
		System.out.println("Gave Amount "+amount+" for expense "+expensename);
		
	}

	@Override
	public void balance(String amount, String expensename) {

		
	}

}
