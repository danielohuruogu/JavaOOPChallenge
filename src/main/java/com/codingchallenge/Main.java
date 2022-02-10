package com.codingchallenge;

import java.util.List;

public class Main {

	public static void main(String[] args){
		Item A = new Item("A", 20);
		Item B = new Item("B", 30);
		Item C = new Item("C", 50);

		List<Item> fakeItems = List.of(A,B,B,B,B,B,B,C,C);

		PromoEngine promo = new PromoEngine();

		promo.applyMultipleItemPromo(fakeItems);
	}
}
