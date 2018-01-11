package sort.algorithms;

import java.util.List;
import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class BubbleSort extends SortAlgorithm {
	@Override
	public List<Integer> sort(List<Integer> array) {
		Util.printArray(array);

		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size() - 1; j++) {
				if (array.get(j) > array.get(j + 1)) {
					swap(array, j, j + 1);
					Util.printArray(array);
				}
			}
		}

		return array;
	}
}
