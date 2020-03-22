package Lab3.java;
import java.util.*;
public class Theatre1IfApp {

	
	public static void main (String[] args) {
		
		Theatre1If t = new Theatre1If();
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter day of the week: ");
		String day = input.next();
		t.setDay(day);
		t.displayPrice(day);
		t.getP1();
		t.getP2();
	}
}
