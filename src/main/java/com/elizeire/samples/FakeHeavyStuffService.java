package com.elizeire.samples;

import java.util.ArrayList;
import java.util.List;

public class FakeHeavyStuffService {

	public static List<Integer> processAllHevyStuff() {

		Integer times = 9999;

		List<Integer> result = new ArrayList<Integer>();
		for (int x = 0; x < times; x++) {

			result.add(processHeavyStuff(x, times));
		}

		return result;
	}

	private static Integer processHeavyStuff(int x, Integer times) {
		Integer result = 0;
		if (x % 2 == 0) {
			result = x ^ times;
		} else {
			result = x * times;
		}
		return result;
	}

}
