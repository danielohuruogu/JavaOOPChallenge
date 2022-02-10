package com.codingchallenge;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private ArrayList<Item> items = new ArrayList<Item>();

	public Cart(Item... itemsInCart){
		for (Item i: itemsInCart){
			this.items.add(i);
		}
	}

	public List getItems(){
		return this.items;
	}
}
