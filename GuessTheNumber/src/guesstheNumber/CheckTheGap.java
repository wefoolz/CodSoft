package guesstheNumber;

public class CheckTheGap {
	/*
	 * this class holds the method highOrLow()
	 * this method has 2 parameters
	 * which are compare and return false 
	 * if the 1st parameter is greater than 
	 * the 2nd parameter
	 * 
	 * and return the value
	 * */
	public boolean highOrLow(int generatedNumber, int guessedNumber) {
		if(generatedNumber>guessedNumber) {
			return false;
		}
		return true;
	}
}
