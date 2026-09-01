package com.algoexpert.bsts.green;

import java.util.*;
//https://www.algoexpert.io/questions/find-closest-value-in-bst



//note: the particular sample case is a bst tree . but the whole thing is  just a regular binary tree . so if you change the sample it means 
// you are working with a regular binary  tree 

//test case 1  -> input : 13    expectedoutput: 13   output:13 
//fails test case 10 .
//test case 10 -> input : -1    expectedoutput: 1   output:1 solved at init of cur_closest_value


class FindClosestValueInBst {

	public static void main(String[] args) {
		
		
		//store sample for bst 
        FindClosestValueInBst.BST t = new FindClosestValueInBst.BST (100); 
        //System.out.println(t.value);        
        //preorder traversal like 
        t.left =  new FindClosestValueInBst.BST (5);
        t.left.left =  new FindClosestValueInBst.BST (2);
        t.left.left.left =  new FindClosestValueInBst.BST (1);
        t.left.left.left.left =  new FindClosestValueInBst.BST (-51);
        t.left.left.left.left.left =  new FindClosestValueInBst.BST (-403);
        t.left.left.left.right =  new FindClosestValueInBst.BST (1);
        t.left.left.left.right.right =  new FindClosestValueInBst.BST (1);
        t.left.left.left.right.right.right =  new FindClosestValueInBst.BST (1);
        t.left.left.left.right.right.right.right =  new FindClosestValueInBst.BST (1);
        t.left.left.right =  new FindClosestValueInBst.BST (3);
        t.left.right =  new FindClosestValueInBst.BST (15);
        t.left.right.left =  new FindClosestValueInBst.BST (5);
        t.left.right.right =  new FindClosestValueInBst.BST (22);
        t.left.right.right.right =  new FindClosestValueInBst.BST (57);
        t.left.right.right.right.right =  new FindClosestValueInBst.BST (60);        
        t.right =  new FindClosestValueInBst.BST (502);
        t.right.left =  new FindClosestValueInBst.BST (204);
        t.right.left.left =  new FindClosestValueInBst.BST (203);
        t.right.left.right =  new FindClosestValueInBst.BST (205);
        t.right.left.right.right =  new FindClosestValueInBst.BST (207);
        t.right.left.right.right.left =  new FindClosestValueInBst.BST (206);
        t.right.left.right.right.right =  new FindClosestValueInBst.BST (208);
        t.right.right =  new FindClosestValueInBst.BST (55000);
        t.right.right.left =  new FindClosestValueInBst.BST (1001);
        t.right.right.left.right =  new FindClosestValueInBst.BST (4500);
	    
		/*
		//store sample for bst 
		HelloWorld.BST t = new HelloWorld.BST (10); 
		//System.out.println(t.value);		
		//preorder traversal like 
		HelloWorld.BST t2 = new HelloWorld.BST (5);	//level 2 
		t.left = t2;
		HelloWorld.BST t3 = new HelloWorld.BST (2);	//level 3 
		t.left.left = t3;
		HelloWorld.BST t4 = new HelloWorld.BST (1);	//level 4 
		t.left.left.left = t4;
		HelloWorld.BST t5 = new HelloWorld.BST (5);	//level 3 
		t.left.right = t5;
		HelloWorld.BST t6 = new HelloWorld.BST (15);  //level 2 
		t.right = t6;
		HelloWorld.BST t7 = new HelloWorld.BST (13);	//level 3 
		t.right.left = t7;
		HelloWorld.BST t8 = new HelloWorld.BST (14);	//level 4
		t.right.left.right = t8;
		HelloWorld.BST t9 = new HelloWorld.BST (22);	//level 3
		t.right.right = t9;
		*/
		
        int input_value = -1;
		//function call 
		int answer = findClosestValueInBst(t,input_value);
		System.out.println(answer);

	}
	
    public static int findClosestValueInBst(BST tree, int target) {
        //initial value cannot be zero becuase if 0 is not in the binary tree 
        //there is a chance that 0 is still gonna be the closest number (which is not necessarily true)
        int current_closest_value = tree.value; 
        return findClosestValueInBst(tree, target, current_closest_value);
    }
    
    

    //10,5,2,1,5,15,13,14,22
    public static int findClosestValueInBst (BST tree, int target, int current_closest_value){


        if(tree != null){

            //formula for the distance between to points in a non diagonal line 
        	// d = |P1-P2|     works same as the number line with positive and negative numbers 
			int distance_to_current_closest_value = Math.abs(current_closest_value - target);
			int distance_to_tree_value = Math.abs(tree.value - target);
			
            //update closest value 
			if ( distance_to_current_closest_value  > distance_to_tree_value  ){
				current_closest_value = tree.value;
			}
        

            //System.out.println(my_tree.value );
            current_closest_value = findClosestValueInBst(tree.left, target, current_closest_value);
            
            current_closest_value = findClosestValueInBst(tree.right, target, current_closest_value);
            //System.out.println(my_tree.value );
                    

        }

        return current_closest_value;
        

    }



	static class BST { 
		public int value;
		public BST left;
		public BST right;

		public BST( int value){
			this.value = value; 
		}
	}



}