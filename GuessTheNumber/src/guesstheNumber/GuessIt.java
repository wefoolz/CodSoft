package guesstheNumber;

import java.util.Scanner;

public class GuessIt {
	/*
	 * this class holds the method guessTheNumber()
	 * this method ask user to input a value
	 * and return the value
	 * */
	int guessedNumber;
	private Scanner scan;

	public int guessTheNumber()
	{

		scan = new Scanner(System.in);
		System.out.println("Please Guess The Number: ");
		guessedNumber=scan.nextInt();
		
		return guessedNumber;
	}
}
