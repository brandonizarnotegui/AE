package com.algoexpert.arrays.blue;

//SpiralTraverse.java temporarily HelloWorld.java
/*
 Write a function that takes in an n x m two-dimensional array 
(that can be squared-shaped when n == m) and returns a one-dimensional array of 
all the array's elements in spiral order. Spiral order starts at the top left 
corner ofthe two-dimensional array, goes to the right, and proceeds in a spiral
pattern all the way until every element has been visited. 
sample input 
array = [
    [1,   2, 3,  4],
    [12, 13, 14, 5],
    [11, 16, 15, 6],
    [10,  9, 8,  7],
]
sample output 
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
the method should look like this: 
public static List<Integer> spiralTraverse(int[][] array){	
	//code here 
	return new ArrayList<Integer>();
}
 */

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

	public static void main(String[] args) {
		

		
		int[][] arr = {
			    {1,   2,  3, 4},
			    {12, 13, 14, 5},
			    {11, 16, 15, 6},
			    {10,  9,  8, 7}
			};
		
		spiralTraverse(arr);
		
		
	}
	
	
	public static List<Integer> spiralTraverse(int[][] array){	
		
			
		int sideSize =  array.length;
		System.out.println("the side = " + sideSize);
		
		int i = 0; 
		int j = 0; 
		int counter = 0;
		int numLoops = (sideSize*3)-4-1; 
                //System.out.println((sideSize*3)-4-1);  //7
		System.out.print(array[0][0] + " ");
                
                //1 to 10 
		while (counter < numLoops) {

                    if (i == 0 && j != sideSize-1) {
                        j++;
                        System.out.print(array[i][j] + " ");
                    }
                    if (i != sideSize-1 && j == sideSize-1) {    		
                        i++;
                        System.out.print(array[i][j] + " ");
                    }
                    if (i == sideSize-1 && j != 0) {
                        j--;
                        System.out.print(array[i][j] + " ");
                    }

                    counter++;
		}
		

                
                /*
                        int[][] arr = {
			    {1,   2,  3, 4},
			    {12, 13, 14, 5},
			    {11, 16, 15, 6},
			    {10,  9,  8, 7}
			};
                */
                
                //i = 0; 
		//j = 0; 
		counter = 0;
                int level = 1;
		numLoops = 50; 
                //System.out.println((sideSize*3)-4-1);  //7
		//System.out.print(array[0][0] + " ");
                sideSize = sideSize/2;
                
                //10 to center
		while (counter < numLoops) {

                    if (i != 0+1 && j == 0) {
                        i--;                                    //goes up starting from the botton left
                        System.out.println(array[i][j] + " ");
                    }
                    
                    //you need to fix the ones below 
                    
                    if (i == 0+1 && j != sideSize) {    		
                        j++;                                    //goes right starting from the upper left
                        System.out.println(array[i][j] + " ");
                    }
                    
                   
                    if (i != sideSize && j == sideSize) {
                        i++;                                    //goes down starting from the upper right
                        System.out.println(array[i][j] + " ");
                    }
                    
                    //this is overlaping . fix it later  
                    if (i == sideSize && j != 0+1) {
                        //j--;                                    //goes left starting from the botton right
                        System.out.println("j == " + j);
                        System.out.println(array[i][j] + " ");
                    }
                    
                    counter++;
		}
                
                
                
                
                
                
                
                
                
                
                
                
                
		//This way the code will work even if the array size change in future. but harder to read. 
		/*
		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array[i].length; j++) {
		    	
		    	System.out.print(array[i][j] + " ");
		    	if (i == 0 && j != sideSize) {
		    		System.out.print(array[i][j] + " ");
		    		j++;
		    		}
		    	
		    	
		    	
		    	//if (i != sideSize && j == sideSize) {System.out.print(array[i][j] + " ");i++;}
		    	//if (i != sideSize && j != 0) {System.out.print(array[i][j] + " ");j--;}
		    	    	
		        //System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
		*/
		/*
		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array[i].length; j++) {
		    	
		    	if () {
		    		
		    	}
		    	if () {
		    		
		    	}
		    	
		        System.out.print(array[i][j] + " ");
		    }
		    System.out.println();
		}
		*/
		//code here 
		return new ArrayList<Integer>();
	}

}
