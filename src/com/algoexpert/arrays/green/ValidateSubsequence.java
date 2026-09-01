package com.algoexpert.arrays.green;

import java.util.*;
//final version , passes all tests 

/*

definition of subsequence:
a subsequence is a sequence that can be derived from another sequence 
by deleting some elements without changing the order of the remaining elements 

-subset must be contained inside the set 
-set can have more ocurrences of certain element than subset
i.e. this is NOT a subset 
set = [1,2,3,4] 
subset = [1,2,2] 
-aware elements order, subset must be in the same order they appear in set
i.e. this is NOT a subset 
set = [1,2,3,4] 
subset = [4,2] 


 */

class ValidateSubsequence {


    public static void main(String[] args) {

        
        //to memory 
    	//1,2,3,4
        ArrayList <Integer> set = new ArrayList <Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        //4,2
        ArrayList <Integer> subset = new ArrayList <Integer>();
        subset.add(4);
        subset.add(2);
        
        
    

    

        //"array": [5, 1, 22, 25, 6, -1, 8, 10],
        //"sequence": [5, 1, 25, 22, 6, -1, 8, 10]  expected false 
        
        /*
        ArrayList <Integer> set = new ArrayList <Integer>();
        set.add(5);
        set.add(1);
        set.add(22);
        set.add(25);
        set.add(6);
        set.add(-1);   
        set.add(8);
        set.add(10);
    
        ArrayList <Integer> subset = new ArrayList <Integer>();
        subset.add(5);
        subset.add(1);
        subset.add(25);
        subset.add(22);
        subset.add(6);
        subset.add(-1);   
        subset.add(8);
        subset.add(10);
        */
    

        boolean answer = isValidSubsequence(set, subset);
        System.out.println(answer);



    }

    //note sequence == subset , array == set 
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence){
        
        int prev_index = 0;  

        //traverse
        for (int i = 0 ; i < sequence.size(); i++){
          
            int cur_sequence_el = sequence.get(i);

            //ensure order of elements remain the same
            if (array.indexOf(cur_sequence_el) < prev_index) {
                return false;
            }

            //is cur_element contained in array 
            if (array.contains(cur_sequence_el)){

                System.out.println("set contains " + cur_sequence_el);
                prev_index = array.indexOf(cur_sequence_el);
                //prev_index = i-1;  //won work dont use this 
                array.set(array.indexOf(cur_sequence_el),null);
            
            }else{
           
                System.out.println("false , the array does not contain this el");
                return false;
            }
        }

        return true;

    }



}