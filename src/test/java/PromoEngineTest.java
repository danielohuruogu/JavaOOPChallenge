
import com.codingchallenge.Item;
import com.codingchallenge.PromoEngine;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromoEngineTest {

	List<Item> fakeItems = List.of(
			new Item("A", 20),
			new Item("B", 30),
			new Item("B", 30),
			new Item("B", 30),
			new Item("B", 30),
			new Item("B", 30),
			new Item("B", 30),
			new Item("C", 50));

	@Test
	public void testEngineSum(){

		int sumValues = 160;
		// want the engine to take a value and apply a promo to it
		assertEquals(PromoEngine.returnSumValue(fakeItems),sumValues);
	}

	@Test
	public void testEnginePromo(){

		// promo rule: buy 3 Bs for 50
		int promoSumValues = 170;
		assertEquals(PromoEngine.applyFixedPromo(fakeItems),promoSumValues);
	}
}
