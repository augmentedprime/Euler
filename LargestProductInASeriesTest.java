package euler;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class LargestProductInASeriesTest {

	@Test
	public void makeArrayListFromStringTest() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList = LargestProductInASeries.numberAsArrayList("0123456789");
		assertEquals(arrayList.get(0), (Integer) 0);
	}

}
