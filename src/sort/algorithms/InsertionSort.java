package sort.algorithms;

import java.util.List;
import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class InsertionSort extends SortAlgorithm {
	@Override
	public List<Integer> sort(List<Integer> array) {
		Util.printArray(array);

		for (int i = 1; i < array.size(); i++) {
			for (int j = (i-1); j >= 0; j--) {
				while (array.get(i) < array.get(j)) {
					swap(array, i, j);
					Util.printArray(array);
				}
			}
		}

		return array;
	}
}
