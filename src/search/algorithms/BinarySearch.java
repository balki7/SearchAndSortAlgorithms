package search.algorithms;

import java.util.List;
import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class BinarySearch extends SearchAlgorithm {
	@Override
	public int search(List<Integer> array, Integer searchValue) {
		Util.printArray(array);

		if (array.isEmpty()) {
			return -1;
		}

		int low = 0;
		int high = array.size() - 1;
		
		while (low <= high) {
			int mid = low + (high - low) / 2;
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
