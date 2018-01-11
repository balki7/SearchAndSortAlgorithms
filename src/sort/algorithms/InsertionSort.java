package sort.algorithms;

import java.util.List;
import util.Util;

/**
 *
 * @author C. Balkı Gemirter
 *
 */
public class InsertionSort extends SortAlgorithm {
	@Override
	public List<Integer> sort(List<Integer> array) {
		Util.printArray(array);

        for (int i = 1; i < array.size(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(array.get(j) < array.get(j-1)){
                    swap(array, j, j-1);
                    Util.printArray(array);
                }
            }
        }

		return array;
	}
}
