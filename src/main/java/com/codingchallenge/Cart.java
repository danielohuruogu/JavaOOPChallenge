package com.codingchallenge;

import java.util.List;

public class Cart {
	private List<Item> items;

	public Cart(Item... itemsInCart){
		for (Item i: itemsInCart){
			this.items.add(i);
		}
	}

	public List getItems(){
		return this.items;
	}
}
