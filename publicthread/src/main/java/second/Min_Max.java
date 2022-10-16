package second;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Min_Max {

	public Integer maxInt(List<Integer> num) {

		Integer max = num.stream().max(Comparator.comparing(i -> i)).get();
		System.out.println("Maximum number in the set is " + max);

		return max;

	}

	public Integer minInt(List<Integer> num) {

		Integer min = num.stream().min(Comparator.comparing(i -> i)).get();
		System.out.println("Maximum number in the set is " + min);

		return min;

	}

	public static void main(String args[]) {

		List<Integer> num = new ArrayList<Integer>();
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		num.add(16);
		num.add(17);
		num.add(18);
		num.add(19);
		num.add(20);

		Min_Max mm = new Min_Max();

		mm.maxInt(num);
		mm.minInt(num);

	}

}