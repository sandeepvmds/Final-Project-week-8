package com.shareexpenseexample.commandpattern;

public class AddBalance implements Fund{
	private ExpenseItem expenseItem;
	
	public AddBalance(ExpenseItem expenseItem) {
		
		this.expenseItem = expenseItem;
	}

	

	@Override
	public void settleFund() {
		expenseItem.addToBalance();
		
	}
}
