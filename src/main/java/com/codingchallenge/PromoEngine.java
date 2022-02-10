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
		if (BCount % 3 == 0) {
			sum -= 40;
		}

		return sum;
	}
}
