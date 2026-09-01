package com.algoexpert.binarytrees.green;

import java.util.ArrayList;
import java.util.List;

//binary tree sample case
class BranchSums {

	public static void main(String[] args) {

		// store
		BranchSums.BinaryTree t = new BranchSums.BinaryTree(1);
		// System.out.println(t.value);

		// preorder traversal like
		BranchSums.BinaryTree t2 = new BranchSums.BinaryTree(2); 
		t.left = t2;
		BranchSums.BinaryTree t3 = new BranchSums.BinaryTree(4); 
		t.left.left = t3;
		BranchSums.BinaryTree t4 = new BranchSums.BinaryTree(8);
		t.left.left.left = t4;
		BranchSums.BinaryTree t5 = new BranchSums.BinaryTree(9); 
		t.left.left.right = t5;
		BranchSums.BinaryTree t6 = new BranchSums.BinaryTree(5); 
		t.left.right = t6;
		BranchSums.BinaryTree t7 = new BranchSums.BinaryTree(10); 
		t.left.right.left = t7;
		BranchSums.BinaryTree t8 = new BranchSums.BinaryTree(3); 
		t.right = t8;
		BranchSums.BinaryTree t9 = new BranchSums.BinaryTree(6); 
		t.right.left = t9;
		BranchSums.BinaryTree t10 = new BranchSums.BinaryTree(7); 
		t.right.right = t10;

		// function call
		ArrayList <Integer> answer = new ArrayList <Integer>();
		answer = branchSums(t);
		System.out.println(answer);

	}
	
	//override
	public static ArrayList<Integer> branchSums(BinaryTree root){
		int accumulated_num = 0;
		ArrayList <Integer> arrl = new ArrayList <Integer>();
		return arrl = branchSums(root, accumulated_num, arrl);
	}

    //1,2,4,8,9,5,10,3,6,7
	public static ArrayList<Integer> branchSums(BinaryTree my_tree, int accumulate, ArrayList<Integer> array) {

		
		if (my_tree != null) {
			
			
			accumulate = accumulate + my_tree.value;
			
			//store when you reach leaf at last level of each branch 
			if (my_tree.right == null && my_tree.left == null) {
				array.add(accumulate);
			}
			
			
			//System.out.println(my_tree.value);
			array = branchSums(my_tree.left, accumulate, array);

			array = branchSums(my_tree.right, accumulate, array);
			//System.out.println(my_tree.value);

		}
		
		return array;

	}

	public static class BinaryTree {
		public int value;
		public BinaryTree left;
		public BinaryTree right;

		public BinaryTree(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}

}