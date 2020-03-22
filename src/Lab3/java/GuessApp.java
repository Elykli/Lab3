package Lab3.java;
/**
GuessApp 
	uses the instantiable class GuessNumber
	allows the user to guess a number 1 time
*/
import java.util.*;
public class GuessApp {
	public static void main (String[]args) {
	
		//declare a local variable named num to store the number provided bu user
		int num;
		//declare a variable named input, create an object of type scanner
		Scanner input = new Scanner (System.in);
		//declare a vriable and create an object of type GuessNumber
		GuessNumber checker = new GuessNumber();
		
		//input
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		//to assign in the instance variable guess of the object checker the number provided by user
		//and saved in the local variable num
		checker.setGuess(num);
		
		//processing
		//call compare() on object checker to determinewhether user provided the correct number
		
		checker.compute();
		
		//output
		//retrieve the message to find out whether the user guessed or not
		//save the message in the variab;e called m
		String m = checker.getMessage();
		System.out.println(m);
		
		//retrieve the secret number 
		int s = checker.getSecret();
		System.out.println("secret number is: "+ s);
	}//end main

}
