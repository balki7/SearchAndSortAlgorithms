package sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import sort.algorithms.SortAlgorithm;
import util.Util;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class Sort {
	private final static int COUNT = 20;

	public static void main(String args[])
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		List<Integer> array = new ArrayList<Integer>();

		for (int i = 0; i < COUNT; i++) {
			array.add(new Random().nextInt(100 - 0) + 1);
		}

		System.out.println("Initial Array");
		Util.printArray(array);
		System.out.println("\n");

		for (SortType searchType : SortType.values()) {
			System.out.println(searchType.getName());
			ClassLoader classLoader = SortType.class.getClassLoader();
			Class<?> sort = classLoader.loadClass(searchType.getClassName());

			Util.printArray(((SortAlgorithm) sort.newInstance()).sort(new ArrayList<>(array)));
			System.out.println("\n\n");
		}
	}
}
