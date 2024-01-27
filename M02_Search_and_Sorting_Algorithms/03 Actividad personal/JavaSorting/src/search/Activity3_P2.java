package search;

public class Activity3_P2 {

	public static void main(String[] args) {

		char[] array1;
		char[] array2; 

		//Test Case 1
		array1 = new char[]{'a', 'b', 'c'};
		array2 = new char[]{'a', 'b', 'c'};
		boolean p1 = compareArrays(array1, array2);
		System.out.println("Test Case 1: Expected answer: true / Answer: " + p1);

		//Test Case 2
		array1 = new char[]{'a', 'b', 'c'};
		array2 = new char[]{'a'};		
		boolean p2 = compareArrays(array1, array2);
		System.out.println("Test 2: Expected answer: false / Answer: " + p2);

		//Test Case 3
		array1 = new char[]{'a', 'b', 'c'};
		array2 = new char[]{'A', 'B', 'C'};		
		boolean p3 = compareArrays(array1, array2);
		System.out.println("Test 3: Expected answer: false / Answer: " + p3);		
		
		//Test Case 4
		array1 = new char[]{};;
		array2 = new char[]{'a', 'b', 'c'};	
		boolean p4 = compareArrays(array1, array2);
		System.out.println("Test 4: Expected answer: false / Answer: " + p4);		
		
		//Test Case 5
		array1 = new char[]{'a', 'b', 'c', 'd'};;
		array2 = new char[]{'a', 'b', 'c'};	
		boolean p5 = compareArrays(array1, array2);
		System.out.println("Test 5: Expected answer: false / Answer: " + p5);			
		
	}
	
	/**
	 * Compares array a with array b. The result is true if and only if the 
	 * size of both arrays is the same, and the contents of each index are equal.
	 * @param a
	 * @param b
	 * @return True if both arrays are equal, false if they are different.
	 */
	public static boolean compareArrays(char[] a, char[] b){
		//complete code here
		return true;
	}

}
