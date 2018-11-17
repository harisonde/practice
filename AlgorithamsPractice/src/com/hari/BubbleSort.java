package com.hari;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] inputArray = new int[] {200, 100, 75, 50, 25, 10, 5, 1};
		
		int[] sortedArray = bubbleSort(inputArray);
		
		System.out.println("Sorted Array is :- ");
		for(int result : sortedArray) {
			System.out.println(result);
		}
	}
	
	private static int[] bubbleSort(int[] inputArray) {	
		for(int i=0; i <inputArray.length; i++) {
			int keyIndex = 0;
			for(int j= 0; j < inputArray.length- 1 -i; j++) {
				if(inputArray[keyIndex] < inputArray[j + 1]) {
					keyIndex = j + 1;
				}
			}
			
			int temp = inputArray[inputArray.length - 1 -i];
			inputArray[inputArray.length - 1 -i] = inputArray[keyIndex];
			inputArray[keyIndex] = temp;
		}
		
		return inputArray;
	}

}
