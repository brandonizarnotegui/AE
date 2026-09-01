package com.algoexpert.arrays.blue;

// incomplete : this is missing the sorting . i donot understand the sorting logic here come back later 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

	public static void main(String[] args) {
		
		//int[] arr = {0,1,2,3,4};
		int [] arr = {12,3,1,2,-6,5,-8,6};
		int ThetargetSum = 0; 
		
		List<Integer[]> answer = new ArrayList<>();
		answer = threeNumberSum(arr, ThetargetSum);
		
		
		
		for (Integer[] array : answer) {
		    for (Integer value : array) {
		        System.out.print(value + " ");
		    }
		    System.out.println();
		}


	}
	
	
	//similar logic on proj algorythms (triplet combinations )
	//the sorting works now 
	//get  the target sum back //current problem is the target sum if condition is wrong and is not storing any values the arrs are empty 
	  //function to use 
	  public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

		  
			ArrayList <Integer[]> triplets = new ArrayList<>();		
			
			//print all triplets 
			for (int i = 0; i < array.length; i++) {
			    for (int j = i + 1; j < array.length; j++) {
			        for (int k = j + 1; k < array.length; k++) {
			        	
			        	if (array[i] + array[j] + array[k] == targetSum) {
			        	Integer[] tempTriplet = new Integer[3];
			        	//add values to  current triplet
			        	tempTriplet[0] = array[i];
			        	tempTriplet[1] = array[j];
			        	tempTriplet[2] = array[k];
			        	
			        	
			        	triplets.add(tempTriplet);
			        	}
			        	//System.out.println(tempTriplet);
			            //System.out.println(array[i] + " " + array[j] + " " + array[k]);
			        }
			    }
			}
			
			System.out.println("-------------> " + triplets.get(0)[0]);
			
					
			// flag to check if the array is sorted
			boolean sorted = false; 	      
			// variable to keep track of the number of swaps made in each iteration
			int count = 0; 	      
			// variable to iterate through the array
			int i = 0 ; 
			
				//this sorting logic is wrong because all triplets sum to the target sum. so the sum of all equals that number . 
				// idk the logic behind the proper sort . ...
			while(!sorted) {
				
				if (triplets.get(i)[0] + triplets.get(i)[1] + triplets.get(i)[2] >
				    triplets.get(i+1)[0] + triplets.get(i+1)[1] + triplets.get(i+1)[2])  {
					//swap
					Integer [] temp = triplets.get(i);
					triplets.set(i , triplets.get(i+1))  ;  
					triplets.set(i+1, temp);
					count++;
				}
				
				i++;
				
				// if we have reached the end of the array and there have been swaps made, reset the counter and start over
				if (i == triplets.size()-1 && count > 0){ i = 0; count=0; }
				
				// if we have reached the end of the array and there have been no swaps made, the array is sorted
				if (i == triplets.size()-1 && count == 0  ) {sorted = true;}
			}
			
			
			//System.out.println(triplets);
			

		  
		  
	    return triplets;
	  }

}
