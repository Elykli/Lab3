package Lab3.java;
/*
 * Your local theatre charges different prices during the week and during the weekends.  
 * The prices are outlined in the table below:
Day:				Price:
Monday - Thursday		€20
Friday - Sunday			€30
You have been asked to develop an application that allows a user to enter the day of the week 
and then display the cost of a theatre ticket for that person based on the day of the week. 
 */
public class Theatre1If {
	
	private int p1 = 20;
	private int p2 = 30;
	
	Theatre1If(){

	}
	
	public void setDay(String day) {
	}
	
	public int getP1() {
		return p1;
	}
	
	public int getP2() {
		return p2;
	}
    
		public void displayPrice(String day) {
			day = day.toLowerCase();
			if(day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") || day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday")) {
				System.out.println("Tickets price is " + p1 + " EUR");
			}else if (day.equalsIgnoreCase("friday") || day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("sunday")) {
				System.out.println("Tickets price is " + p2 + " EUR");
			}else{
				System.out.println("Check your input!");
			}
				
		}
}

