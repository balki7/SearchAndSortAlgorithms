package search;

import java.util.ArrayList;
import java.util.List;

import search.algorithms.SearchAlgorithm;
import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class Search {
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		List<Integer> array = new ArrayList<Integer>();
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		array.add(50);
		array.add(60);
		
		Integer searchValue = 20;
		
		System.out.println("Array : ");
		Util.printArray(array);
		System.out.println("Search Value : " + searchValue);
		System.out.println("\n");
		
		for (SearchType searchType : SearchType.values()) {
			System.out.println(searchType.getName());
			ClassLoader classLoader = Search.class.getClassLoader();
			Class search = classLoader
					.loadClass(searchType.getClassName());
			
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
