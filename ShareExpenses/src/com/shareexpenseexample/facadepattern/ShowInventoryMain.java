package com.shareexpenseexample.facadepattern;

public class ShowInventoryMain {

	public static void main(String[] args) {
		
		ItemFacade showInventory = new ItemFacade();
		showInventory.showItemOne();
		showInventory.showItemTwo();

	}

}
