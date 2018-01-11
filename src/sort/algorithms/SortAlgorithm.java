package sort.algorithms;

import java.util.List;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public abstract class SortAlgorithm {
	public abstract List<Integer> sort(List<Integer> array);
	
	protected List<Integer> swap(List<Integer> array, int i, int j) {
		int temp = array.get(i);
		array.set(i, array.get(j));
		array.set(j, temp);
		return array;
	}
}
