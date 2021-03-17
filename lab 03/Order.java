package aimsproject;
import java.util.*;
import java.util.Scanner;
public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	
	private Stack<DigitalVideoDisc> itemsOrdered = new Stack<DigitalVideoDisc>();
	
	int qtyOrdered = itemsOrdered.size();
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBER_ORDERED) {
			itemsOrdered.push(disc);
			System.out.println("The disc has been added");
			qtyOrdered++;
		if(qtyOrdered == MAX_NUMBER_ORDERED - 1) {
			System.out.println("Almost Full");
		}
		if(qtyOrdered >= MAX_NUMBER_ORDERED) {
			System.out.println("The order is full");
			return;
		}
		}
			
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		itemsOrdered.removeElement(disc);
		qtyOrdered--;
		System.out.println("The disc has been removed");
	}
	public float totalCost() {
		float totalcost = 0;
		while(itemsOrdered.size() > 0)
			totalcost += itemsOrdered.pop().getCost();
		return totalcost;
	}
	
}
