package com.shareexpenseexample.commandpattern;

public class ExpenseItem {
	
	public ExpenseItem() {
		super();
	}
	public void addToBalance() {
		System.out.println("The item price is added to balance");
	}
	public void settleItemExpense() {
		System.out.println("The item expense is settled");
	}
}
