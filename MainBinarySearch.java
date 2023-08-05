package com.binarysearch;

public class MainBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int element = 6;
		int result = binarySearch(array, element);
		System.out.println("Element "+ element + " is found at " + result);
		

	}
	public static int binarySearch(int array[], int element) {
		int start = 0;
		int end = array.length - 1;
		int mid = (start + end)/2;
		while(start<=end) {
			mid = (start + end)/2;
			if(array[mid] == element) {
				return mid;
			}
			else if(element < array[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
