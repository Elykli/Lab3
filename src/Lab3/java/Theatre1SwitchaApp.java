package Lab3.java;

import java.util.Scanner;

public class Theatre1SwitchaApp {

	public static void main(String[] args) {
		Theatre1Switch t = new Theatre1Switch();
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter day of the week: ");
		String day = input.next().toLowerCase();
		
		t.setDay(day);
		t.displayPrice(day);
		t.getP1();
		t.getP2();
		

	}

}
