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

		int discount = 40;

		int noDiscounts = 0;
		int sum = 0;

		for (Item item : itemsList){
			if (item.getSku() == "B") {
				BCount++;
				if (BCount % 3 == 0) {
					noDiscounts++;
				}
			}
			sum += item.getPrice();
		}
		// have to make sure that it can handle a lot of Bs coming through a list
		// want to find the number of 3s occuring, so we can minus that many discounts off the total
		int totalDiscount = noDiscounts * discount;

		return sum - totalDiscount;
	}

	public static int applyMultipleItemPromo (List<Item> itemsList) {
		// promo rule: buy 2 C and 1 A for 80;
		int ACount = 0;
		int CCount = 0;

		int noDiscounts = 0;
		int discount = 40;

		int sum = 0;

		for (Item item : itemsList){
			if (item.getSku() == "A") {
				ACount++;
//				System.out.println("number of As is " + ACount);
			} else if (item.getSku() == "C") {
				CCount++;
//				System.out.println("number of Cs is " + CCount);
			}

			// when there's twice as many Cs as As, apply discount
			if (ACount * 2 == CCount) {
				noDiscounts++;
//				System.out.println("number of discounts is " + noDiscounts);
			}
			sum += item.getPrice();
		}

		int totalDiscount = noDiscounts * discount;
//		System.out.println("total Discount is " + totalDiscount);
		return sum - totalDiscount;
	}
}
