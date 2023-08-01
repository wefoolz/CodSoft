package guesstheNumber;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
	/* 
	 * this class contain the main method
	 * the main method calls other method
	 * from GuessIt class, CheckIt class
	 * and from CheckTheGap class
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int round=0;//to store the number of rounds a user playes
		int attempts;//to limit the attempt of the user
		int score=0;//to store the score of the user based on the attempt and the rounds palyed
		int randomNumber=0;//to store the randomly generated number
		int guessedNumber = 0;// to store the guessed number by user
		boolean result = false;// to store the result of comparision of guessednumber and randomnumber
		boolean gapBetweenNumbers = false;//for the output of the comparision of the gap between
											//randomnumber and the guessednumber
		boolean playAgain=true;//for storing false if user want to exit;
		
		
		Random generate = new Random();//object created for Random class inherited from java.util
		Scanner scan = new Scanner(System.in);
		System.out.println("hello");
		System.out.println("Welcome to The Number Guessing Game!");
		System.out.println("Hello Usesr We will Generated A Number Between 1 To 10!");
		System.out.println("You Have To Guess The Correct Number!!");
		System.out.println("You Have Only 3 Attempts!");
		System.out.println("Every Remaining Attempts And The Correct Attemp Will Give You 5 Points!");
		System.out.println("Lets Try Out Your Luck! All The Very Best!");
		
		
		while(playAgain) {
			round++;
			attempts=3;
			System.out.println("Number Generated!");
			randomNumber = generate.nextInt(10)+1;
			
			while(attempts>0) {
				
				
				try {
					GuessIt guess =new GuessIt();//object of GuessIt class
					guessedNumber=guess.guessTheNumber();//calling method of GuessIt class
					
				CheckIt check = new CheckIt();//object of CheckIt class
				result=check.checkTheNumber(randomNumber, guessedNumber);//calling method of CheckIt class
				if(result==true) {
					System.out.println("Congratulations User!!! You Have Guessed Correct Number: "+randomNumber);
					score+=attempts*5;
					break;
				}
				
				
				if(result==false) {
					CheckTheGap gap = new CheckTheGap();//object of CheckTheGap class
					gapBetweenNumbers = gap.highOrLow(randomNumber, guessedNumber);//calling function of CheckTheGap class
				}
				
				
				if(gapBetweenNumbers==false) {
					System.out.println("Your Guessed Number Is Too Low");
				}
				if(gapBetweenNumbers==true){
					System.out.println("Your Guessed Number Is Too High");
				}
				}catch(InputMismatchException e) {
					System.out.println("Please Enter A value between 1 to 20 in integer format");
					attempts++;
				}
				
				attempts--;
				
			}
			
			
			if(result==false) {
				System.out.println("Better Luck Next Time!!");
			}
			
			
			
			System.out.println("round Played: "+round);
			System.out.println("Your Score Is: "+score);
			System.out.println("Do You want To Play Again?(Y/N)");
			String c = scan.next();
			
			
			if(c.contains("y")==false) {
				playAgain=false;
				System.out.println("Game Over!!Well Played");
			}
			
		}
		scan.close();
	}

}
