package sort.algorithms;

import java.util.List;

import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class QuickSort extends SortAlgorithm {
	@Override
	public List<Integer> sort(List<Integer> array) {
		Util.printArray(array);

		if (array.isEmpty()) {
			return array;
		}

		quickSort(array, 0, array.size() - 1);

		return array;
	}

	private void quickSort(List<Integer> array, int lowerIndex, int higherIndex) {
		Util.printArray(array);
		System.out.println("Lower index : " + lowerIndex + " Higher index : " + higherIndex);

		int i = lowerIndex;
		int j = higherIndex;
		int pivot = array.get(lowerIndex + (higherIndex - lowerIndex) / 2);
		System.out.println("Pivot : " + pivot);

		while (i <= j) {
			while (array.get(i) < pivot) {
				i++;
			}

			while (array.get(j) > pivot) {
				j--;
			}

			if (i <= j) {
				swap(array, i, j);
				i++;
				j--;
			}
		}

		System.out.println("Lower Index : " + lowerIndex + " j : " + j);
		if (lowerIndex < j) {
			quickSort(array, lowerIndex, j);
		}

		System.out.println("Higher Index : " + higherIndex + " i : " + i);
		if (i < higherIndex) {
			quickSort(array, i, higherIndex);
		}
	}
}
