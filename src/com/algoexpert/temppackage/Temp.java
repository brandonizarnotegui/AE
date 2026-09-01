package com.algoexpert.temppackage;
//subsequence
import java.util.ArrayList;
import java.util.List;
// it solves the is current index ensuring order of elements remained the same 
// now , just make sure the elements are the same
public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  "array": [5, 1, 22, 25, 6, -1, 8, 10],
		//"sequence": [5, 1, 22, 23, 6, -1, 8, 10]
		
        int ar[] = {5, 1, 22, 25, 6, -1, 8, 10};
        int su[] = {1, 6, -1, 10};      
        ArrayList <Integer> arl = arrayToArrayList(ar); 
        ArrayList <Integer> sul = arrayToArrayList(su); 
        
        

        boolean answer = isValidSubsequence(arl, sul);
        System.out.println(answer);



    }

    //note sequence == subset , array == set 
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence){
    	
    	
    	
        int last_matched_pos = -1;
        
        for (int i = 0 ; i < array.size(); i++) {
        	
        	for(int j = 0 ; j < sequence.size(); j++) {
        		
        		int cur_ar_index = i;
        		int cur_su_index = j;
        		int cur_ar_el = array.get(i);
        		int cur_su_el = sequence.get(j);
        		
        		if (cur_ar_el == cur_su_el) {      			
        			if (cur_ar_index < last_matched_pos) { //tru for first time 
        				return false;
        			} 			
        			last_matched_pos = cur_ar_index;
        		}
        		
        		
        	}//end of inner 
        	
        }//ed of outer 
    	
    	
    	
    	return true;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static ArrayList<Integer> arrayToArrayList(int[] arr) {
		  // Create a new ArrayList
		  ArrayList<Integer> arrayList = new ArrayList<>();

		  // Add each element of the input array to the ArrayList
		  for (int i : arr) {
		    arrayList.add(i);
		  }

		  // Return the ArrayList
		  System.out.println(arrayList);
		  return arrayList;
		}


}
