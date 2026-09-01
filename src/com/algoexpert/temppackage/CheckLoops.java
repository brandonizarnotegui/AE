package com.algoexpert.temppackage;

public class CheckLoops {

	public static void main(String[] args) {

		

			int[] arrayOne = { 0,1,2,3,4};
			int[] arrayTwo = { 0,1,2,3 };
				  
				  
		int[] arr = smallestDifference(arrayOne, arrayTwo);
		System.out.println( "|");

	}

	
	//this works for the inner array 
	public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {

		
		
		for (int j = 0 ; j < arrayTwo.length ; j++) {
		
			for (int i = 0; i < arrayOne.length; i++) {  //start inner
			
				
				
				System.out.println( arrayTwo[j]+" - "+arrayOne[i]);
				

			
				
			}//end of inner 		
			
			
		
		}//end of outer 
		

		return null;
	}

}
