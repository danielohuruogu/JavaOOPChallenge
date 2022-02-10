import com.codingchallenge.Cart;
import com.codingchallenge.Item;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CartTest {

	Item A = new Item("A", 20);
	Item B = new Item("B", 30);
	Item C = new Item("C", 50);

	@Test
	public void getCartItems(){
		Cart fakeCart = new Cart(A,A,B,B,C);
		ArrayList<Item> fakeList = new ArrayList<Item>();
		fakeList.add(A);
		fakeList.add(A);
		fakeList.add(B);
		fakeList.add(B);

		Object fakeCartList = fakeCart.getItems();
		assertEquals(fakeCartList.getClass(), fakeList.getClass());
	}
}
