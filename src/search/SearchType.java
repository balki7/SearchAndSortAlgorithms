package search;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public enum SearchType {
	LINEAR_SEARCH("Linear Search", "search.algorithms.LinearSearch"),
	BINARY_SEARCH("Binary Search", "search.algorithms.BinarySearch"),
	INTERPOLATION_SEARCH("Interpolation Search", "search.algorithms.InterpolationSearch");
	private final String name;	
	private final String className;
	
	/**
	 * @param name
	 * @param className
	 */
	private SearchType(String name, String className) {
		this.name = name;
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public String getClassName() {
		return className;
	}	
	
	

}
