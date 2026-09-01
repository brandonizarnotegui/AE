package com.yt.most_value_street_block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//import java.util.*;


class HelloWorld {


	public static void main(String[] args) {


		System.out.println("Hello world!");
		
		/*
		  
		//idk i dont think array work 
        //nested arraylist 
        ArrayList <ArrayList<String>> blocks = new ArrayList<>();
        
        //first inner arraylist form of [place,available]
        blocks.add(new ArrayList<String>(Arrays.asList("gym", "false")));
        blocks.add(new ArrayList<String>(Arrays.asList("school", "true")));
        blocks.add(new ArrayList<String>(Arrays.asList("store", "false")));
                
        System.out.println("blocks :" + blocks);
        System.out.println("block 0: " + blocks.get(0));
        System.out.println("block 0 of place 0: " + blocks.get(0).get(0));
        */
        
		
		ArrayList <HashMap<String, Boolean>> l_blocks = new ArrayList<>();
				
        HashMap <String, Boolean> block0 = new HashMap <String, Boolean> (); 
        block0.put("gym",false);
        block0.put("school", true);
        block0.put("store", false);
        l_blocks.add(block0);

        HashMap <String, Boolean> block1 = new HashMap <String, Boolean> (); 
        block1.put("gym",true);
        block1.put("school", false);
        block1.put("store", false);
        l_blocks.add(block1);
        
        HashMap <String, Boolean> block2 = new HashMap <String, Boolean> (); 
        block2.put("gym",true);
        block2.put("school", true);
        block2.put("store", false);
        l_blocks.add(block2);
        
        HashMap <String, Boolean> block3 = new HashMap <String, Boolean> (); 
        block3.put("gym",false);
        block3.put("school", true);
        block3.put("store", false);
        l_blocks.add(block3);
        
        HashMap <String, Boolean> block4 = new HashMap <String, Boolean> (); 
        block4.put("gym",false);
        block4.put("school", true);
        block4.put("store", true);
        l_blocks.add(block4);
        
        //System.out.println(l_blocks);
        
		/*
		ArrayList <HashMap<String, Boolean>> l_blocks = new ArrayList<>();
		
        HashMap <String, Boolean> block0 = new HashMap <String, Boolean> (); 
        block0.put("gym",true);
        block0.put("school", false);
        block0.put("store", false);
        l_blocks.add(block0);

        HashMap <String, Boolean> block1 = new HashMap <String, Boolean> (); 
        block1.put("gym",true);
        block1.put("school", true);
        block1.put("store", false);
        l_blocks.add(block1);
        
        HashMap <String, Boolean> block2 = new HashMap <String, Boolean> (); 
        block2.put("gym",true);
        block2.put("school", true);
        block2.put("store", true);
        l_blocks.add(block2);
        */
        
        int answer = getMostValuedBuildingToLiveIn(l_blocks);
        System.out.println(answer);

	}
	
	
	public static int getMostValuedBuildingToLiveIn(ArrayList <HashMap<String, Boolean>> blocks) { 
		

		int cur_distance = 0; 
		//int space_raw_value = 0; 
		int space_value_based_on_distance = 0; 
		int cur_value_for_individual_block = 0;  //raw value 
		int cur_value_for_cur_set_of_blocks = 0;
		int location = 0;
		int exponent = 0 ; 
		
		HashMap <String,Integer> most_value_block = new HashMap<String, Integer>();
		//most_value_block.put("score", 0);
		
		
		for (int i = 0 ; i < blocks.size(); i++) {
		
			
			for (int j = 0 ; j < blocks.size(); j++) {
				
				cur_distance = Math.abs(j-i);
				
				
				//cur_block = blocks.get(j);
				//cur_available_place = blocks.get(j).get("");
				
				if (blocks.get(j).get("gym") == true) {
					cur_value_for_individual_block++;
				}
				if (blocks.get(j).get("school") == true) {
					cur_value_for_individual_block++;
				}
				if (blocks.get(j).get("store") == true) {
					cur_value_for_individual_block++;
				}
				
				
				//more value == bad 
				
				//calculation

				space_value_based_on_distance = cur_value_for_individual_block - (cur_distance*cur_distance);
				cur_value_for_cur_set_of_blocks = cur_value_for_cur_set_of_blocks + space_value_based_on_distance;

				
							
				cur_value_for_individual_block = 0;
			}
			
			
		
			if (most_value_block.get("score") == null) {
				most_value_block.put("score", 0);
				location = i;
			}
			
			//if the var is greater , then we have anew largest value 
			if (most_value_block.get("score") < cur_value_for_cur_set_of_blocks) {
				

				most_value_block.put("score", cur_value_for_cur_set_of_blocks);
				location = i;
			}
			
			System.out.println("cur_value_for_cur_set_of_blocks: "+ cur_value_for_cur_set_of_blocks);
			cur_value_for_cur_set_of_blocks=0;
			
		
		}
		
		
		return location;
		
	}


}