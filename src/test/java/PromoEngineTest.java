
import com.codingchallenge.Item;
import com.codingchallenge.PromoEngine;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromoEngineTest {
	// items to use
	Item A = new Item("A", 20);
	Item B = new Item("B", 30);
	Item C = new Item("C", 50);

	@Test
	public void testEngineSum(){
		List<Item> fakeItems = List.of(A,B,C);

		int sumValues = 100;
		// want the engine to take a value and apply a promo to it
		assertEquals(PromoEngine.returnSumValue(fakeItems),sumValues);
	}

	@Test
	public void testFixedPricePromo(){
		// promo rule: buy 3 Bs for 50

		List<Item> fakeItems = List.of(A,B,B,B,B,B,B,C);

		int promoSumValues = 170;
		assertEquals(PromoEngine.applyFixedPromo(fakeItems),promoSumValues);
	}

	@Test
	public void testMultipleItemPromo(){
		// promo rule: buy 2 C and 1 A for 80
		List<Item> fakeItems = List.of(A,B,B,B,B,B,B,C,C);

		int promoSumValues = 260;
		assertEquals(PromoEngine.applyMultipleItemPromo(fakeItems),promoSumValues);
	}
}
