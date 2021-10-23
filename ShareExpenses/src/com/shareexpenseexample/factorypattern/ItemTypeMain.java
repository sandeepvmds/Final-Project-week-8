package com.shareexpenseexample.factorypattern;

public class ItemTypeMain {

	public static void main(String[] args) {
		ItemFactory itemFactory = new ItemFactory();
		Item it1 = itemFactory.getItem("Food");
		it1.showItem();
		Item it2 = itemFactory.getItem("Grocery");
		it2.showItem();
		Item it3 = itemFactory.getItem("Internet");
		it3.showItem();
	}

}
