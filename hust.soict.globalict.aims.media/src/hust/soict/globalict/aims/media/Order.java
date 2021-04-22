package hust.soict.globalict.aims.media;
import java.util.*;

public class Order {
	
	private List<Media> itemsOrdered = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if(itemsOrdered.contains(media))
			return;
		else
			itemsOrdered.add(media);
			System.out.println("Item is added");
	}
	
	public void removeMedia(Media media) {
		if(itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("Item is removed");
		}
		else
			return;
	}
	
	public int qty() {
		return itemsOrdered.size();
	}
	
	public float totalcost() {
		float totalCost = 0;
		
		for(int i = 0; i < itemsOrdered.size(); i++) {
			totalCost += itemsOrdered.get(i).getCost();
		}
		
		return totalCost;
	}
	
	public void showlist() {
		System.out.println("The Order List");
		System.out.println("--------------------------------");
		for(int i = 0; i < itemsOrdered.size(); i++) {
			System.out.print("ID: ");
			System.out.println(itemsOrdered.get(i).id);
			
			System.out.print("Name: ");
			System.out.println(itemsOrdered.get(i).title);
			
			System.out.print("Category: ");
			System.out.println(itemsOrdered.get(i).category);
			
			System.out.print("Price: ");
			System.out.println("$" + itemsOrdered.get(i).cost);	
			System.out.println("--------------------------------");
			
				
		}
		return;
	}
	
	public void removebyid(int inputid) {
		
		for(int i = 0; i < itemsOrdered.size() ; i++) {									
			if(itemsOrdered.get(i).id == inputid) {
				itemsOrdered.remove(i);		
				System.out.println("Removed");
				}		
			}
		for(int i =0; i < itemsOrdered.size(); i++) {
			if(itemsOrdered.get(i).id > inputid) {
				itemsOrdered.get(i).id -= 1;
			}
		}
	}
}

