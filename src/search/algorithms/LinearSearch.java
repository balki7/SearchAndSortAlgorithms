package search.algorithms;

import java.util.List;
import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class LinearSearch extends SearchAlgorithm{
	@Override
	public int search(List<Integer> array, Integer searchValue) {
		Util.printArray(array);
		
		for(int i = 0; i<array.size(); i++) {
			System.out.println("Check : " + array.get(i));
			
			if(array.get(i) == searchValue) {
				return i;
			}
		}
		
		return -1;
	}
}
