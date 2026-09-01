package com.algoexpert.arrays.blue;

import java.util.Arrays;
import java.util.List;


/*
https://www.algoexpert.io/questions/move-element-to-end
move element to end 
you are given an array of integers and an integer. write a fucntion that moves 
all instances of that integer in the array to the end of the array and returns 
the array. The function should perform this in place (i.e., it should mutate 
the input array) and does not need to maintain the order of the other integers. 

sample input 
array = [2, 1, 2, 2, 2, 3, 4, 2]
toMove = 2

Sample output 
[1, 3, 4, 2, 2, 2, 2, 2]  //the numbers 1, 3  and 4 could be ordered differently
 */

//concepts used: iteration with two pointers, swaping
public class MoveElementToEnd {

	public static void main(String[] args) {
		
		
		//2,1,2,2,2,3,4,2
		//1,1,2,3
		List<Integer> arr = Arrays.asList(2,1,2,2,2,3,4,2);
		int numToMove = 2;  //dont forget to provide this input !!!!!!!
		
		
		List<Integer> ans_arrl = moveElementToEnd(arr,numToMove);		
		System.out.println(ans_arrl);
		
		

		
		


	}
	
	
	
	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove){

		int temp = 0; // variable to store the temporary value during swap
		int i = 0 ; 
		int right_pointer = array.size()-1;
		
		//(right_pointer >= i) means, if the pointers intercept stop loop 
		while( right_pointer >= i) {

			//(right_pointer !=0 &&) means if the right pointer is 0, stop decrementing pointer because is 0 lowest possible i
			while (right_pointer !=0 && array.get(right_pointer) == toMove) {
				right_pointer--;
			}
						
			//if current index i is the one to move then swap it with the right pointer  && dont swap if the pointers intercept
		    if (array.get(i) == toMove && right_pointer >= i) {		    		    	
		    	//swap i with the right pointer 
				temp = array.get(i);
				array.set(i , array.get(right_pointer))  ;  
				array.set(right_pointer, temp);
				right_pointer--;
		    }
		    System.out.println(array);
		    

			i++;
		}
		
		return array;

	}
	




}
