package com.purplewisteria.expressions_statements_blocks_methods.methods;

public class ScoreDisplay {

	public static void main(String[] args) {
		
		  int highScorePosition = CalculateScore.calculateHighScorePosition(1500);
		  CalculateScore.displayHighScorePosition("Tim", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(900);
	        CalculateScore.displayHighScorePosition("Bob", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(400);
	        CalculateScore.displayHighScorePosition("Percy", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(50);
	        CalculateScore.displayHighScorePosition("Gilbert", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(1000);
	        CalculateScore.displayHighScorePosition("Louise", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(500);
	        CalculateScore.displayHighScorePosition("Carol", highScorePosition);

	        highScorePosition = CalculateScore.calculateHighScorePosition(100);
	        CalculateScore.displayHighScorePosition("Frank", highScorePosition);

	}

}
