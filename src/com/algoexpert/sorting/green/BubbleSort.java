package com.algoexpert.sorting.green;

//average time complexity 
//import java.util.*;

class BubbleSort {

    // main method
	public static void main(String[] args) {


      // declare and initialize an array of integers
		int [] arr = {1,3,4,5,6,1,4};
		int temp = 0; // variable to store the temporary value during swap
	
      // flag to check if the array is sorted
		boolean sorted = false; 
      
      // variable to keep track of the number of swaps made in each iteration
      int count = 0; 
      
      // variable to iterate through the array
		int i = 0 ; 
		
		// while loop to sort the array using the bubble sort algorithm
		while (!sorted && arr.length != 1){

			// if current element is greater than the next element, swap them
			if (arr[i] >  arr[i+1]){
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				count++;
			}
		
			i++;
			
			// if we have reached the end of the array and there have been swaps made, reset the counter and start over
			if (i == arr.length-1 && count > 0){ i = 0; count=0; }
			
			// if we have reached the end of the array and there have been no swaps made, the array is sorted
			if (i == arr.length-1 && count == 0  ) {sorted = true;}
			
		}
		
      // print out the elements of the sorted array
		for(int z = 0 ; z < arr.length ; z++) {
			System.out.println(arr[z]);
		}
		

	}


}

