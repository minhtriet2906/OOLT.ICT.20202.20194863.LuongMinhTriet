package aimsproject;
import java.util.*;
public class Aims {

	public static void main(String[] args) {
		// Create a new order 
		Order anOrder = new Order();
		
		//Create new DVD objects and add them to order 
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f); 
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		//DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", 24.95f);
		//anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.print("The total cost is: ");
		System.out.println(anOrder.totalCost());
	}
	
}
