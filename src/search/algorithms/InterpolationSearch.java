package search.algorithms;

import java.util.List;
import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class InterpolationSearch extends SearchAlgorithm {
	@Override
	public int search(List<Integer> array, Integer searchValue) {
		Util.printArray(array);

		if (array.isEmpty()) {
			return -1;
		}

		int low = 0;
		int high = array.size() - 1;
		
		while (low <= high && searchValue >= array.get(low) && searchValue <= array.get(high)) {
			int mid = 0;
			if(low == high) {
				mid = low;
			}
			else {
				mid = low + ((high - low) / (array.get(high) - array.get(low))) * (searchValue - array.get(low));
			}
			
			System.out.println("Check : " + array.get(mid));
			
			switch (searchValue.compareTo(array.get(mid))) {
			case -1: {
				high = --mid;
				break;
			}
			case 0: {
				return mid;
			}
			case 1: {
				low = ++mid;
				break;
			}
			}
		}

		return -1;
	}
}
