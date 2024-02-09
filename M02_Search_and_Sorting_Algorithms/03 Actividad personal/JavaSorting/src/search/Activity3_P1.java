package search;


public class Activity3_P1 {

	public static void main(String[] args) {

		int[] testData1 = {3, 5, 10, -1, 0, 1, 5};
		printArray(testData1); //expect [3, 5, 10, -1, 0, 1, 5] to be printed on the console
		
		int[] testData2 = {5};
		printArray(testData2); //expect [5] to be printed on the console
		
		int[] testData3 = {};
		printArray(testData3); //expect [] to be printed on the console
		
	}
	
	/**
	 * This method should print the contents of the array received.
	 * @array Input array to be printed
	 */
	public static void printArray(int[] array) {
		
		if (array == null) {
			System.out.println("[]");
		}
		
		
		System.out.print("[");
		
		for(int i=0; i<array.length; i++) {
			if (array.length-1 == i) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ",");				
			}
		}
		
		System.out.print("]");
		System.out.println();
	}

}
