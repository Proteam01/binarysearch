package binarysearch;

/**
 * this algorithm works by doing comparisons between pointers to the array and discarding half of the array,
 * 
 * let's suppose we have a large list of one million records and we need a index this can be faster by discarding half of the array.
 *
 */
public class App {

	public static void main(String[] args) {
		// list of numbers to check, the list must be ordered to work, if the list is not ordered, the search will not work.
		int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		// position of the array 
		int position = binarysearch(integers, 7);
		// if the position is -1 this means the array does not contain the number
		if (position != -1) {
			System.out.println("the item exists at: " + position);
			System.out.println(integers[position]);
		} else {
			System.out.println("the item does not exist in the array");
		}
	}
	
	/**
	 * this method searches in the array a specific element and returns his position in the current array
	 * @param array integer array.
	 * @param element number to search in the array
	 * @return an index containing the position where the element is located.
	 */
	public static int binarysearch(int[] array, int element) {
		int low = 0;
		int high = array.length - 1;
		// do a while this condition checks if the low index is not equal or higher than the high index 
		while (low <= high) {
			// get the middle element by doing a sum and then divide by 2
			int mid = (high + low) / 2;
			int firstElement = array[low]; // gets the first element in the array
			int midElement = array[mid];   // gets the middle element in the array
			int lastElement = array[high]; // gets the last element in the array
			// if the element is the first element we return the low position
			if (element == firstElement) {
				return low;
			}
			// if the element is the last element we return the last position
			if (element == lastElement) {
				return high;
			}
			// if the element is the middle then return the mid index
			if (element == midElement) {
				return mid;
			}
			// if element is out of bounds this means the element is not in the list
			if (element > lastElement || element > firstElement) {
				return -1;
			}
			// if the element is lower than the middle element and higher than the first element the high index points to the mid index
			if (element > firstElement && element < midElement) {
				high = mid;
			}
			// if the element is higher than the middle element and lower than the last element move the low index to the mid index
			if (element > midElement && element < lastElement) {
				low = mid;
			}
		}
		return -1;
	}

}
