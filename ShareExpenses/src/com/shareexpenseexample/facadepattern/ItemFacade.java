package com.shareexpenseexample.facadepattern;

public class ItemFacade {
	private Item i1;
	private Item i2;
	public ItemFacade() {
		i1 = new Food();
		i2 = new Grocery();
	}
	public void showItemOne() {
		i1.showItem();
	}
	public void showItemTwo() {
		i2.showItem();
	}

}
