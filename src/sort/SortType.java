package sort;

/**
 * 
 * @author c. Balkı Gemirter
 *
 */
public enum SortType {
	BUBBLE_SORT("Bubble Sort", "sort.algorithms.BubbleSort"),
	INSERTION_SORT("Insertion Sort", "sort.algorithms.InsertionSort"),
    SELECTION_SORT("Selection Sort", "sort.algorithms.SelectionSort");

	private final String name;
	private final String className;

	/**
	 * @param name
	 * @param className
	 */
	private SortType(String name, String className) {
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
