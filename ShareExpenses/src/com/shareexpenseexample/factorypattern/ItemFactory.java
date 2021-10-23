package com.shareexpenseexample.factorypattern;

public class ItemFactory {
	public Item getItem(String item) {
		if (item.equals("Food")) {
			return new Food();
		}
		if (item.equals("Grocery")) {
			return new Grocery();
		}
		if (item.equals("Internet")) {
			return new Internet();
		} else {
			return null;
		}
	}
}
