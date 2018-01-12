package sort.algorithms;

import java.util.ArrayList;
import java.util.List;

import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class ShellSort extends SortAlgorithm {

	@Override
	public List<Integer> sort(List<Integer> array) {
		Util.printArray(array);

		int interval = 1;
		while (interval < (array.size() / 3)) {
			interval = interval * 3 + 1;
		}

		array = sortByInterval(array, interval);
		Util.printArray(array);

		return array;
	}

	private List<Integer> sortByInterval(List<Integer> array, int interval) {
		System.out.println("Interval : " + interval);
		Util.printArray(array);

		List<Integer> sortedList = new ArrayList<Integer>();
		int index = 0;
		while (index + interval < array.size()) {
			sortedList.addAll(new InsertionSort().sort(array.subList(index, index + interval)));
			index += interval;
		}

		if (index + interval > array.size()) {
			sortedList.addAll(new InsertionSort().sort(array.subList(index, array.size())));
		}

		interval = (interval - 1) / 3;
		if (interval > 1) {
			return sortByInterval(sortedList, interval);
		} else {
			return sortedList;
		}
	}
}
