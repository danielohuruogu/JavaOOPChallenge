package com.codingchallenge;

import java.util.List;

public class PromoEngine {

	public static int returnSumValue(List<Item> itemsList) {
		int sum = 0;
		for (Item item : itemsList) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public static int applyFixedPromo(List<Item> itemsList) {
		// fixed promo is 3 * B = 50
		int BCount = 0;

		int sum = 0;

		for (Item item : itemsList){
			if (item.getSku() == "B") {
				BCount++;
			}
			sum += item.getPrice();
		}
		// have to make sure that it can handle a lot of Bs coming through a list
		// want to find the number of 3s occuring, so we can minus that many discounts off the total
		int BMultiples = (int) Math.floor(BCount/3);
		int totalDiscount = BMultiples * 40;

		return sum - totalDiscount;
	}
}
