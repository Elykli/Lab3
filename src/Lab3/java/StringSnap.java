package Lab3.java;
/**
StringSnap -- checks whether 2 Strings are the same, and then prints "SNAP" if they are the same.
Instruction: Once we finish writing a program we must test it to make sure that the program works exactly as described in the problem's text.
Compile and run the program with the next inputs:
Test 1:
enter first word:
john
enter second word:
john
the result should be:
SNAP !!!
------------------------
Test2:
enter first word:
john
enter second word:
mark
no message should be displayed
-------------------------
Test 3:
enter first word:
john
enter second word:
JOHN
the result should be:
SNAP1, with ignoreCase
SNAP2 with UpperCase
*/
import java.util.*;
//declare a class named StringSnaped
public class StringSnap {

	public static void main(String[] args) {
		//declare 2 local variables to store input provided by user
		String text1, text2;
		
		//declare a variable named sc of type scanner, and create an object of type scanner
		Scanner sc = new Scanner (System.in);
		//input
		System.out.println("Please enter word 1: ");
		text1 = sc.next();//reads one word
		
		System.out.println("Please enter word 2: ");
		text2 = sc.next();
		
		//processing
		if (text1.equals(text2)) {
			System.out.println("SNAP, same word!!!");
		}
//		else {
//			System.out.println("Not the same word!");
//		}
		
		System.out.println("===========");
		System.out.println("Lets check two pieces of the text are different");
		if(!text1.equals(text2)) {
			System.out.println("Yes, the rwo pieces are different");
		}else {
			System.out.println("Nope, the two pieces ar the same");
		}
		System.out.println("+++++++++++++");
		
		if(text2.equalsIgnoreCase(text1)) {
			System.out.println("SNAP1 with ignoreCase");
		}
//		boolean isEqual = text2.equalsIgnoreCase(text1);
//		
//		if(isEqual) {
//			System.out.println("SNAP1 with ignoreCase");
//		}
		System.out.println("+++++++++++++");
		
		text1 = text1.toUpperCase();
		text2 = text2.toUpperCase();
		
		if(text1.equals(text2)) {
			System.out.println("SNAP 2 with UpperCase");
		}

	}//end main

}//end class
