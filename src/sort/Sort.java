package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sort.algorithms.SortAlgorithm;
import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class Sort {
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		List<Integer> array = new ArrayList<Integer>();
		array.add(38);
		array.add(27);
		array.add(43);
		array.add(3);
		array.add(9);
		array.add(82);
		array.add(10);
		
		System.out.println("Initial Array");
		Util.printArray(array);
		System.out.println("\n");
		
		for (SortType searchType : SortType.values()) {
			System.out.println(searchType.getName());
			ClassLoader classLoader = SortType.class.getClassLoader();
			Class sort = classLoader
					.loadClass(searchType.getClassName());
			
			System.out.println("Sorted Array : ");
			Util.printArray(((SortAlgorithm) sort.newInstance()).sort(new ArrayList<>(array)));
			System.out.println("\n\n");
		}
	}
}
