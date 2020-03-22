package Lab3.java;
/*guess a number between 1 and 10
Generate a secret number, 
and compare the number with a given (i.e. guessed) number. 
The user (i.e. another class) of the instantiable class GuessNumber 
should provide the 
guessed number via the setGuess() method.
*/
public class GuessNumber {
	//declare instance variables
	private int secret;//to store the number generated by computer
	private int guess;//store number provided by user
	private String message; //instance variable to store message that number is equal or <,>
	
	public GuessNumber() {
		//generate a random number between 1 and 10
		double r1 = Math.random();//generate random number 
		double r2 = r1 * 10;//[0,9]
		System.out.println("r2: " + r2);
		double r3 = r2 +1;//[1...10]
		
	secret = (int)r3;
		
		//option2
		//secret = (int)(Math.random()*10)+1;
		
	}
	
	//declare setter method for  guess instance variable
	public void setGuess(int n) {
		guess= n;
	}
	//declare the processing method
	public void compute() {
		if(guess ==secret) {
			message = "congrats";
		}else if(guess<secret){
			message = "too low";
		}else {
			message = "too high";
		}
	}
	
	//declare getter to retrieve the message
	
	public String getMessage() {
		return message;
		
	}
	
	//getter method to retrieve the secret answer number generated by the comuter
	public int getSecret() {
		return secret;
	}
}//end class