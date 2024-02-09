package search;

import java.util.Arrays;

public class Activity3_P3 {

	public static void main(String[] args) {

		String[] test1 = {"the", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
		int[] results1 = findElement(test1, "the"); // Expected answer [0,5]
		System.out.println(Arrays.toString(results1));
		
		//Add 4 more test cases for this program
		String[] test2 = {"the", "the", "the", "the", "the"};
		int[] results2 = findElement(test2, "the"); // Expected answer [0,1,2,3,4]
		System.out.println(Arrays.toString(results2));
		
		
		String[] test3 = null;
		int[] results3 = findElement(test3, "the"); // Expected answer []
		System.out.println(Arrays.toString(results3));
		
		
		String[] test4 = {"the", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
		int[] results4 = findElement(test4, null); // Expected answer []
		System.out.println(Arrays.toString(results4));
		
		
		String[] test5 = {"the", "brown", "fox", "jumps", "over", "the", "lazy", "dog" };
		int[] results5 = findElement(test5, "inexistent word"); // Expected answer []		
		System.out.println(Arrays.toString(results5));
		
	}
	
	/**
	 * 
	 * @param input Array of Strings containing a list of words
	 * @param target String value to be searched
	 * @return Array with the list of indexes where the "target" String can be found on array "input".
	 */
	public static int[] findElement(String[] input, String target) {
		
		if (input == null) {
			return new int[] {};
		}
		
		
		int count = 0;
		for(int i=0; i<input.length; i++) {
			if (input[i].equals(target)) {
				count++;
			}
		}
		
		int[] result = new int[count];
		int resultIndex = 0;
		for(int i=0; i<input.length; i++) {
			if (input[i].equals(target)) {
				result[resultIndex] = i;
				resultIndex++;
			}
		}		
		
		return result;
		
	}

}
