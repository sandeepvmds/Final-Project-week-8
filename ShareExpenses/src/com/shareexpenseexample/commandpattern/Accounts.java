package com.shareexpenseexample.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Accounts {
	private List<Fund> accountsList = new ArrayList<Fund>();
	
	public void addExpenseAccount(Fund fund) {
		accountsList.add(fund);
	}
	public void processAccount() {
		for(Fund fund: accountsList) {
			fund.settleFund();
		}
		accountsList.clear();
	}
}
