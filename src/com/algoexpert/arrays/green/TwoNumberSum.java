package com.algoexpert.arrays.green;

import java.util.ArrayList;

//reason why I not use the loop pattern : this is a straight translation from paper. 
//https://www.algoexpert.io/questions/two-number-sum
//import java.util.*;

class TwoNumberSum {


	public static void main(String[] args) {


		System.out.println("Hello world!");

		int [] array = {3,5,-4,8,11,1,-1,6};
		//int [] array = {1,2,3,7};
		int targetSum = 10; 
		int cur_sum = 0;
		ArrayList <Integer> ans_arrl = new ArrayList<Integer>();

		for (int i = 0; i < array.length ; i++){
			for (int j = 0; j < array.length ; j++){
				
				if (i == j){
					//ignore current check 
				}else{

					if (array[i] + array[j] == targetSum){

						System.out.println("i " + array[i] + "j " + array[j]);
						cur_sum = array[i] + array[j];
						//put in memory 
						if(!ans_arrl.contains(array[i]) || !ans_arrl.contains(array[j])){ //not allow duplicates
							ans_arrl.add(array[i]); 
							ans_arrl.add(array[j]); 
						}
					}

				}
				
				
				
			}
		}



		//System.out.println(ans_arrl);//debug
		int [] ans_arr = new int[ans_arrl.size()];
		for (int i = 0 ; i < ans_arrl.size() ; i++){
			ans_arr[i] = ans_arrl.get(i);
		}

		//debug
		//for (int i = 0 ; i < ans_arrl.size() ; i++){  
		//	System.out.println(ans_arr[i]);
		//}


	}


}