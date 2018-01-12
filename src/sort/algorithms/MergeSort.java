package sort.algorithms;

import util.Util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class MergeSort extends SortAlgorithm {
	private final static int INTERVAL = 1;
	
	@Override
	public List<Integer> sort(List<Integer> array) {
		Util.printArray(array);

		List<List<Integer>> subLists = subList(array);
		array = mergeLists(subLists);

		return array;
	}

	private List<List<Integer>> subList(List<Integer> array) {
		int mid = array.size() / 2;

		List<List<Integer>> subLists = new ArrayList<List<Integer>>();
		List<Integer> subList = array.subList(0, mid);
		if (subList.size() <= INTERVAL) {
			Util.printArray(subList);
			subLists.add(subList);
		} else {
			subLists.addAll(subList(subList));
		}

		subList = array.subList(mid++, array.size());
		if (subList.size() <= INTERVAL) {
			Util.printArray(subList);
			subLists.add(subList);
		} else {
			subLists.addAll(subList(subList));
		}

		return subLists;
	}

	private List<Integer> mergeLists(List<List<Integer>> subLists) {
		Queue<List<Integer>> listQueue = new LinkedList<>(subLists);
		
		List<List<Integer>> newLists = new ArrayList<>();
		while(listQueue.size() >= 2) {
			newLists.add(mergeList(listQueue.poll(), listQueue.poll()));
		}
		
		while(!listQueue.isEmpty()) {
			newLists.add(listQueue.poll());
		}

		if(newLists.size() == 1) {
			return newLists.get(0);
		}
		
		return mergeLists(newLists);
	}

	private List<Integer> mergeList(List<Integer> firstList, List<Integer> secondList) {
		List<Integer> mergedList = new ArrayList<Integer>();

		Queue<Integer> firstListQueue = new LinkedList<>(firstList);
		Queue<Integer> secondListQueue = new LinkedList<>(secondList);

		while (!firstListQueue.isEmpty() && !secondListQueue.isEmpty()) {
			if (secondListQueue.peek() < firstListQueue.peek()) {
				mergedList.add(secondListQueue.poll());
			} else {
				mergedList.add(firstListQueue.poll());
			}
		}

		while (!firstListQueue.isEmpty()) {
			mergedList.add(firstListQueue.poll());
		}

		while (!secondListQueue.isEmpty()) {
			mergedList.add(secondListQueue.poll());
		}

		Util.printArray(mergedList);
		return mergedList;
	}
}
