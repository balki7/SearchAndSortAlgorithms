package sort.algorithms;

import util.Util;

import java.util.List;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class SelectionSort extends SortAlgorithm {
	@Override
	public List<Integer> sort(List<Integer> array) {
		Util.printArray(array);

		for (int i = 0; i < array.size() - 1; i++) {
		    int minIndex = i;
			for (int j = i; j < array.size(); j++) {
				if (array.get(j) < array.get(minIndex)) {
                    minIndex = j;
				}
			}

			if(minIndex != i) {
                swap(array, i, minIndex);
                Util.printArray(array);
            }
		}

		return array;
	}
}
