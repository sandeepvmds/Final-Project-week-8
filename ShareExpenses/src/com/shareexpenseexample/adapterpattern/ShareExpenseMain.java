package com.shareexpenseexample.adapterpattern;

public class ShareExpenseMain {

	public static void main(String[] args) {
		MonthExpense expense = new MonthExpense();
		expense.getTotalBalance("Group", "60", "food");
		expense.getTotalBalance("Give", "30", "travel");
		expense.getTotalBalance("Balance", "100", "rent");

	}

}
