package pckg1;

import java.util.Arrays;

public class Lab {
	
	public static void main(String[] args) {
		
		char[] test = new char[] {'a','a','b','c','c','d','c','a','z','x','j'};
		char[] output = removeDuplicates(test);
		System.out.println(Arrays.toString(output));
		
		char[] test2 = new char[] {'1','2','3','4'};
		char[] output2 = invertArray(test2);
		System.out.println(Arrays.toString(output2));

		
	}
	
	public static char[] invertArray(char[] input) {
		if (input == null || input.length == 0) {
			return null;
		}
		
		char[] newArray = new char[input.length];
		int newArrayIndex = input.length-1;
		for(int i=0; i<input.length; i++) {
			newArray[newArrayIndex--] = input[i];
		}
		
		return newArray;
		
		
	}
	
	public static char[] removeDuplicates(char[] input) {
		
		if (input == null || input.length == 0) {
			return null;
		}
		
		//count how many different characters are in the array
		int dif = 0;
		boolean found;
		for(int i=0; i<input.length; i++) {
			found = false;
			for(int j=0; j<i; j++) {
				if (input[i] == input[j]) {
					found = true;
				}
			} 
			if (found == false) {
				dif++;
			}
		}
		
		//create new array with new size
		char[] newArray = new char[dif];
		
		//fill new array
		int newPos = 0;
		for(int i=0; i<input.length; i++) {
			found = false;
			for(int j=0; j<i; j++) {
				if (input[i] == input[j]) {
					found = true;
				}
			} 
			if (found == false) {
				newArray[newPos++] = input[i];
			}
		}	
		
		return newArray;

	}

}
