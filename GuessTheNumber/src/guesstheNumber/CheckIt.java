package guesstheNumber;

public class CheckIt {
	/*
	 * this class holds the method checkTheNumber()
	 * this method has 2 parameters
	 * which are compared and return true if 
	 * both are same else return false
	 * */
	public boolean checkTheNumber(int generated, int guessed)//this function check the
	{
		boolean result;
		if(generated==guessed) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
}
