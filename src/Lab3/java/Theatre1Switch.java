package Lab3.java;

public class Theatre1Switch {
	private int p1 = 20;
	private int p2 = 30;
	String day;
	
	public void setDay(String day) {
		day = day;
	}
	
	public int getP1() {
		return p1;
	}
	
	public int getP2() {
		return p2;
	}
    
		public void displayPrice(String day) {
			day = day.toLowerCase();
			switch (day) {
			case "monday":
			case "tuesday":
			case "wednesday":
			case "thursday":
	               System.out.println("Tickets price is " + p1);
	               break;
	               
			case "friday":
			case "saturday":
			case "sunday":
				System.out.println("Tickets price is " + p2);
	               break;
	         default:
	        	 System.out.println("Incorect input!");
			}
				
		}
}
