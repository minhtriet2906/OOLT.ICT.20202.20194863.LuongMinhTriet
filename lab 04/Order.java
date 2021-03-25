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
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		for (int i=0; i< dvdList.length; i++)
		{
			if (qtyOrdered >= MAX_NUMBER_ORDERED) {
				System.out.println("The order is full. List of the DVDs that are not added: ");
				for (int j=0; j< dvdList.length; j++) {
					System.out.println(dvdList[j]);
				}
				break;
			}
			else {
				itemsOrdered.push(dvdList[i]);
				System.arraycopy(dvdList, i+1, dvdList, i, dvdList.length - i - 1);
				qtyOrdered++;
			}
		}
	}
	public int qtyOrdered() {
		return qtyOrdered;
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
