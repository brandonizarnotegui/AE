package com.algoexpert.arrays.green;

import java.util.*;

class TournamentWinner {


	public static void main(String[] args) {

		
		//store information about the competitions
		ArrayList <ArrayList<String>> lcompetitions = new ArrayList<>(); 		
		//each 1d arraylist form of [homeTeam,awayteam]
		lcompetitions.add(new ArrayList<String>(Arrays.asList("HTML", "C#")));
		lcompetitions.add(new ArrayList<String>(Arrays.asList("C#", "Python")));
		lcompetitions.add(new ArrayList<String>(Arrays.asList("Python", "HTML")));
		
		//store information about winner of round 
		ArrayList <Integer> lresults = new ArrayList <Integer>();
		lresults.add(0);lresults.add(0);lresults.add(1);

		String winner = tournamentWinner(lcompetitions, lresults);
		System.out.println(winner);
	}


	public static String tournamentWinner (ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

		ArrayList <String> cur_competition ;
		int cur_result;
		HashMap <String,Integer> table_of_scores = new HashMap <String, Integer> ();
		String prev_winner = "";
		String cur_winner = "";

		//traverse competitions 
		for (int i = 0 ; i< competitions.size() ;i++){

			cur_competition = competitions.get(i);
			cur_result = results.get(i);
			
			System.out.println("cur_competition" + cur_competition + "\tcur_result: " + cur_result );

			//awayteam won 
			if (cur_result == 0){ 
				
				String cur_awayteam = cur_competition.get(1);	

				if (table_of_scores.get(cur_awayteam) == null){ //init map
					table_of_scores.put(cur_awayteam, 0);
				}

				table_of_scores.put(cur_awayteam, Integer.valueOf(table_of_scores.get(cur_awayteam) + 3));
				prev_winner = cur_competition.get(1);
			}

			//hometeam won 
			if (cur_result == 1){  
				String cur_hometeam = cur_competition.get(0);	

				if (table_of_scores.get(cur_hometeam) == null){ //init map
					table_of_scores.put(cur_hometeam, 0);
				}

				table_of_scores.put(cur_hometeam, Integer.valueOf(table_of_scores.get(cur_hometeam) + 3));
				prev_winner = cur_competition.get(0);
			}

			//comparing current winner each iteration  
			table_of_scores.put("", 0); //init map 
			if (table_of_scores.get(cur_winner) < table_of_scores.get(prev_winner)){
				cur_winner = prev_winner;
			}
			
		}
		
		System.out.println(table_of_scores);

		return cur_winner;
      
  	}


}