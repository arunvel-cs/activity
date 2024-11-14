package Practice;

import java.util.*;

public class ArraySortedOrNot {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		ArrayList<Integer> arr1 = new ArrayList<>(arr);
		Collections.sort(arr1);
		if(arr.equals(arr1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
