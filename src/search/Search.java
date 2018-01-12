package search;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import search.algorithms.SearchAlgorithm;
import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class Search {
	private final static int COUNT = 20;

	public static void main(String args[])
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		List<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < COUNT; i++) {
			array.add(new Random().nextInt(100 - 0) + 1);
		}

		Integer searchValue = new Random().nextInt(100 - 0) + 1;

		System.out.println("Array : ");
		Util.printArray(array);
		System.out.println("Search Value : " + searchValue);
		System.out.println("\n");

		for (SearchType searchType : SearchType.values()) {
			System.out.println(searchType.getName());
			ClassLoader classLoader = Search.class.getClassLoader();
			Class<?> search = classLoader.loadClass(searchType.getClassName());

			int index = ((SearchAlgorithm) search.newInstance()).search(array, searchValue);
			if (index == -1) {
				System.out.println(searchValue + " not found.");
			} else {
				System.out.println(searchValue + " index : " + ++index);
			}
			System.out.println("\n");
		}
	}
}
