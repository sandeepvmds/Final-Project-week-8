package com.shareexpenseexample.commandpattern;

public class ExpenseManagementMain {

	public static void main(String[] args) {
		ExpenseItem s1 = new ExpenseItem();
		ExpenseItem s2 = new ExpenseItem();
		
		AddBalance addExpense = new AddBalance(s1);
		SettleItemExpense settleExpense = new SettleItemExpense(s2);
		
		Accounts agent = new Accounts();
		agent.addExpenseAccount(addExpense);
		agent.addExpenseAccount(settleExpense);
		
		agent.processAccount();
		
	}

}
