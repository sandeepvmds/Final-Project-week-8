package com.shareexpenseexample.adapterpattern;

public class MonthExpense implements MyExpense{
	MonthExpenseAdapter monthExpenseAdapter;
	@Override
	public void getTotalBalance(String str, String amount, String expenseName) {
		
	      if(str.equalsIgnoreCase("Group")){
	         System.out.println("Group expense for " + expenseName + " is "+amount);			
	      } 
	      
	      
	      else if(str.equalsIgnoreCase("Give") || str.equalsIgnoreCase("Balance")){
	    	  monthExpenseAdapter = new MonthExpenseAdapter(str);
	    	  monthExpenseAdapter.getTotalBalance(str, amount, expenseName);
	      }
	      
	      else{
	         System.out.println("Invalid methos. " + str);
	      }
	}

}
