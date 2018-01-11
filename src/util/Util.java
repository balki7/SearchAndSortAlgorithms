package util;

import java.util.List;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public class Util {
	
	public static final void printArray(List<Integer> array) {
		System.out.print("Array : [");
		for(Integer num : array) {
			System.out.print(num);
			System.out.print(" ");
		}
		System.out.println("]");
	}
}
