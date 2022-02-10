package com.codingchallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args){
		Item A = new Item("A", 20);
		Item B = new Item("B", 30);
		Item C = new Item("C", 50);

//		List<Item> fakeItems = List.of(A,B,B,B,B,B,B,C,C);

		PromoEngine promo = new PromoEngine();

//		promo.applyMultipleItemPromo(fakeItems);

		Cart cart = new Cart(A,B,B,B,C,C);

		List cartItems = cart.getItems();

		int sumTotal = promo.returnSumValue(cartItems);
		System.out.println(sumTotal);

		int fixedPricePromo = promo.applyFixedPromo(cartItems);
		System.out.println(fixedPricePromo);

		int multiBuyPromo = promo.applyMultipleItemPromo(cartItems);
		System.out.println(multiBuyPromo);

	}
}
