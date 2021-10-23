package com.shareexpenseexample.adapterpattern;

public class MonthExpenseAdapter implements MyExpense {
	GroupExpense groupExpense;
	
	
	public MonthExpenseAdapter(String str) {
		super();
		if(str.equalsIgnoreCase("Give")) {
			groupExpense = new Give();
		}
		if(str.equalsIgnoreCase("Balance")) {
			groupExpense = new Balance();
		}
	}


	@Override
	public void getTotalBalance(String str, String amount, String expenseName) {
		if(str.equalsIgnoreCase("Give")) {
			groupExpense.give(amount, expenseName);
		}
		if(str.equalsIgnoreCase("Balance")) {
			groupExpense.balance(amount, expenseName);
		}
		
	}


	

}
