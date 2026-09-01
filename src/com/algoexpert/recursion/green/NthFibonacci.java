package com.algoexpert.recursion.green;
//note: by making diagram , you can solve evrtyhing 
//just need to know the flow of a binary tree  


class NthFibonacci {
//edited from github master  a

	public static void main(String[] args) {


		System.out.println("Hello world!");

		int answer = f(3);
		System.out.println(answer);


	}

	public static int f (int n){


		if (n == 1){
			System.out.println(n);
			return 1;
		                    //this is the only hard line here 
		}else if(n == 0){   //look at the penultimo node (if you want for this base case to exist it must be n-2)
			System.out.println(n);
			return 0;
		}else{

			System.out.println(n);
			int expressionOne = f(n-1);
			int expressionTwo = f(n-2);   
								  
			return expressionOne + expressionTwo;

		}

    	
	}

}
