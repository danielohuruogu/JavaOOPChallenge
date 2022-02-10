
import com.codingchallenge.Item;
import com.codingchallenge.PromoEngine;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromoEngineTest {

	@Test
	public void testEngineSum(){

		Integer sumValues = 100;
		// want the engine to take a value and apply a promo to it
		assertEquals(PromoEngine.returnSumValue(List.of(
				new Item("A", 20),
				new Item("B", 30),
				new Item("C", 50)
		)),sumValues);
	}

	@Test
	public void testEnginePromo(){

	}
}
