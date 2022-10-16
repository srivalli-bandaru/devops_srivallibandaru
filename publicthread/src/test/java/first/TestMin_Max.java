package first;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import second.Min_Max;

public class TestMin_Max {

	@Test
	public void check() {
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(12);
		num.add(34);
		num.add(54);
		num.add(56);
		num.add(78);
		num.add(77);
		num.add(95);
		num.add(45);
		num.add(88);
		num.add(34);
		
		Min_Max mm = new Min_Max();
		
		Integer a = mm.maxInt(num);
		assertEquals(95, a.intValue());
		
		Integer b = mm.minInt(num);
		assertEquals(12, b.intValue());
		
		
	}
	
}
