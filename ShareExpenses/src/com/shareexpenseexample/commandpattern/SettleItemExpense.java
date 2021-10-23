package com.shareexpenseexample.commandpattern;

public class SettleItemExpense implements Fund {
	private ExpenseItem expenseItem;
	
	public SettleItemExpense(ExpenseItem expenseItem) {
		
		this.expenseItem = expenseItem;
	}

	

	@Override
	public void settleFund() {
		this.expenseItem.settleItemExpense();
		
	}
}
