package com.algoexpert.arrays.blue;


/*
write a function that takes in two non-empty arrays of integers, finds the pair of numbers (one from each array) 
whose absolute difference is closest to zero, and returns an array containing these two numbers, with the number 
from the first array in the first position.

Note that the absolute difference of two integers is the distance between them on the real number line. for example,
the absolute difference of -5 and 5 is 10 and the absolute difference of -5 and -4 is 1. 
You can assume that there will only be one pair of numbers with the smallest difference. 

sample input:  
		int[] arrayOne = { -1, 5, 10, 20, 28, 3 };
		int[] arrayTwo = { 26, 134, 135, 15, 17 };
sample output: 
		[28,26]

 */


//should be comparing < els_of_smallest_inner_calculation [0] = 2 and not prev_calc 
public class SmallestDifference {

	public static void main(String[] args) {
		
		/*
		//test case1 expects 28,26 gets  
		int[] arrayOne = { -1, 5, 10, 20, 28, 3 };
		int[] arrayTwo = { 26, 134, 135, 15, 17 };
		*/
		
		
		//test case 2  expects 20,17 but gets 20,26
		int[] arrayOne = { -1, 5, 10, 20, 3 };
		int[] arrayTwo = { 26, 134, 135, 15, 17 };
		
		
		
		//test case 9 and 10 are wrong try that now 
				  
		int[] arr = smallestDifference(arrayOne, arrayTwo);
		System.out.println( "|" + arr[0] + "-" + arr[1] + "|");

	}

	

	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

		int[] els_of_smallest_inner_calculation = new int[3];
		els_of_smallest_inner_calculation [0] = Integer.MAX_VALUE;


		for (int h = 0 ; h < arrayOne.length; h++) {//start outer 	
			for (int i = 0; i < arrayTwo.length; i++) {  //start inner  

				int calculation = Math.abs( arrayOne[h]- arrayTwo[i]);  //get calculation 
				
				//prev_calculation
				if (calculation < els_of_smallest_inner_calculation [0]) {   //concept of smallest calculation 
					els_of_smallest_inner_calculation [0]  =  calculation;   //store smallest calculation 
					els_of_smallest_inner_calculation [2]  =  arrayTwo[i]; 
					els_of_smallest_inner_calculation [1]  =  arrayOne[h]; 
				}

				
			}//end of inner 		


		}//end of outer 
		
		
		//store final result in answer array 
		int [] ans = new int [2];
		ans[0]=els_of_smallest_inner_calculation[1];
		ans[1]=els_of_smallest_inner_calculation[2];
		
		return ans;
	}




	

}





