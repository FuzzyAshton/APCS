package unit3;

import java.util.Scanner;

public class Lab3 {
	/*
	 * For this assignment, you will create a program that plays a simple game of
	 * War against the computer. You will create a method that: Creates an array of
	 * 10 integers for your deck and another array for the computers deck Populate
	 * the arrays with random values from 1-20 using Math.random() Has a loop that
	 * compares the first elements from your deck, and then the second...etc. Print
	 * out which player has the bigger card and wins that round. If they are equal
	 * to each other print : “Tie” Keep track of how many times player 1 (you) and
	 * player 2 (computer) wins At the end print who won the game (whoever won more
	 * times) Extension: Ask the user if they want to play again. Keep track of how
	 * many times they won vs. the computer.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] playerDeck = new int[10];
		int[] computerDeck = new int[10];
		int score = 0;
		int totalWins = 0;
		int totalPlays = 0;
		System.out.println("Do you want to play war? Y/N");
		while (!in.nextLine().equalsIgnoreCase("n")) {
			for (int i = 0; i < computerDeck.length; i++) {
				computerDeck[i] = (int) (Math.random() * 20 + 1);
			}
			for (int i = 0; i < playerDeck.length; i++) {
				playerDeck[i] = (int) (Math.random() * 20 + 1);
			}
			for (int i = 0; i < playerDeck.length; i++) {
				System.out.println("You had a " + playerDeck[i] + " while I had a " + computerDeck[i]);
				if (playerDeck[i] > computerDeck[i]) {
					System.out.println("You won");
					score++;
				}
				else if (computerDeck[i] > playerDeck[i]) {
					System.out.println("I won");
					score--;
				}
				else {
					System.out.println("Tie");
				}
			}
			System.out.println("The final score was " + score);
			System.out.print("That means ");
			if (score > 0) {
				System.out.println("you won by " + score + " round(s)");
				totalWins++;
			}
			// Score is negative if the computer won more
			else if (score < 0) {
				System.out.println("you lost by " + -score + " round(s)");
			}
			else {
				System.out.println("it was a tie.");
			}
			totalPlays++;
			System.out.println("Do you want to play war again? Y/N");
			score = 0;
		}
		System.out.println("You won a total of " + totalWins + " times out of the " + totalPlays + " games.");
		System.out.println("That is a win rate of " + (((double) totalWins) / ((double) totalPlays)) * 100 + " percent");
	}
}