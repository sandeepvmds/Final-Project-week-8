package com.shareexpenseexample.adapterpattern;

public class Balance implements GroupExpense{

	@Override
	public void give(String amount, String expensename) {
		
	}

	@Override
	public void balance(String amount, String expensename) {
		System.out.println("Balance Amount "+amount+" for expense "+expensename);
		
	}

}
