package com.binarysearch;

public class MainBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int element = 6;
		int result = binarySearch(array, element);
		System.out.println("Element "+ element + " is found at " + result);
		
		int array1[]= {1,2,2,2,2,2,2,8,9,10};
		element = 2;
		binarySearchCountFrequency(array1, element);
		
		int array2[]= {6,7,8,9,10,1,2,3,4,5};
		System.out.println("Number of times array is rotated " + numberOfTimesArrayIsRotated(array2));
		element = 9;
		System.out.println("Element "+ element + " is found at " + searchingInNearlySortedRotated(array2, element));


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
	public static void binarySearchCountFrequency(int array[], int element) {
		int start = 0;
		int end = array.length - 1;
		int mid = (start + end)/2;
		int first = 0;
		int last = 0;
		int frequency = 0;
		while(start<=end) {
			mid = (start + end)/2;
			if(array[mid] == element) {
				first = mid;
				end = mid -1;
			}
			else if(element < array[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		start = 0;
		end = array.length - 1;
		while(start<=end) {
			mid = (start + end)/2;
			if(array[mid] == element) {
				last = mid;
				start = mid + 1;
			}
			else if(element < array[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		frequency = last - first + 1;
		System.out.println("First occurence of the element is at " + first);
		System.out.println("last occurence of the element is at " + last);
		System.out.println("Count of the element is " + frequency);
	}
	public static int numberOfTimesArrayIsRotated(int array[]) {
		int start = 0;
		int end = array.length - 1;
		int mid = (start + end)/2;
		while(start<=end) {
			mid = (start + end)/2;
			int prev = (mid + array.length - 1)% array.length;
			int next = (mid + 1)%array.length;
			if(array[prev] <= array[mid] && array[mid] <= array[next]) {
				return mid;
			}
			else if(array[mid] < array[end]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static int searchingInNearlySortedRotated(int array[], int element) {
		int start = 0;
		int end = array.length - 1;
		int mid = (start + end)/2;
		while(start<=end) {
			mid = (start + end)/2;
			if(array[mid] == element) {
				return mid;
			}
			if(start <= mid - 1 && array[mid-1] == element) {
				return mid-1;
			}
			if(end<= mid +1 && array[mid+1] == element) {
				return mid+1;
			}
			else if(array[mid] < element) {
				end = mid - 2;
			}
			else {
				start = mid + 2;
			}
		}
		return -1;
	}

}
