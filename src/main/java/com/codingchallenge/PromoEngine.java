package com.codingchallenge;

import java.util.List;
import java.util.Map;

public class PromoEngine {

	public static Integer returnSumValue(List<Item> itemsList) {
		int sum = 0;
		for (Item item : itemsList) {
			sum += item.getPrice();
		}
		return sum;
	}
}
