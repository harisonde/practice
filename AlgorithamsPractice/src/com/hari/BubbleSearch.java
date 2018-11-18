package com.hari;

public class BubbleSearch {
	
	public static void main(String[] args) {
		int[] inputArray = new int[] {3, 8, 9, 16, 18,56,67, 88, 99};
		
		int searchResult = binarySearchItrWay(inputArray, 99);
		
		if(searchResult != -1) {
			System.out.println("Search Element found at following Location using itr way " + searchResult);
		}
		
//		searchResult = binarySearchItrWay(inputArray, 89);
//		
//		if(searchResult != -1) {
//			System.out.println("Search Element found at following Location using itr way " + searchResult);
//		}

	}
	
	private static int binarySearchItrWay(int[] inputArray, int searchElement) {
		int result = -1;
		int low = 0;
		int high = inputArray.length -1;
		int mid;
		while(low <= high) {
			mid = low + (high - low)/2;
			
			if(inputArray[mid] == searchElement) {
				return mid;
			}
			if(inputArray[mid] > searchElement) {
				high = mid -1;
			}
			
			if(inputArray[mid] < searchElement) {
				low = mid + 1;
			}
			
		}
		
		return result;
	}
}
