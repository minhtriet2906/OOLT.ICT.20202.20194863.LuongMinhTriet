package hust.soict.globalict.aims.media;
import java.util.*;

public class Aims {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Order Management Application: "); 

		System.out.println("--------------------------------"); 

		System.out.println("1. Create new order"); 

		System.out.println("2. Add item to the order"); 

		System.out.println("3. Delete item by id"); 

		System.out.println("4. Display the items list of order"); 

		System.out.println("0. Exit"); 

		System.out.println("--------------------------------"); 

		System.out.println("Please choose a number: 0-1-2-3-4"); 
		
		int choice;
		Order anOrder = new Order();
				
		do {
		    System.out.println("Enter \"0\", \"1\", \"2\", \"3\". \"4\" ");		   
		    choice = sc.nextInt();
		  
		    switch (choice)
		    {
		    	case 0:
		    		System.out.println("Exit");
		    		System.exit(0);
		    		break;
	        	
		        case 1:
		            // do something
		        	anOrder = null;
		        	break;
		        	
		        case 2: 
		            // ..something else
		        	System.out.println("Select type of media(1.DVD, 2.Book): ");		        	
		        	int mediatype = sc.nextInt();
		        	
		        	if(mediatype == 1) {
		        		System.out.print("DVD's name: ");
		        		String name = sc.nextLine();
		        		
		        		System.out.print("DVD's catagory: ");
		        		String catagory = sc.nextLine();
		        		
		        		System.out.print("DVD's director: ");
		        		String director = sc.nextLine();
		        		
		        		System.out.print("DVD's length: ");
		        		int length = sc.nextInt();
		        		
		        		System.out.print("DVD's cost: ");
		        		float cost = sc.nextFloat();
		        		
		        		DigitalVideoDisc dvd = new DigitalVideoDisc(name ,catagory, director , length, cost, anOrder.qty()+1);
		        		//DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f, anOrder.qty()+1);
			    		anOrder.addMedia(dvd);	
			    		
		        		
		        	}
		        	else if(mediatype == 2) {
		        		Book book1 = new Book("The Hobbit", "Novel", 19.95f,  "J. R. R. Tolkien", anOrder.qty()+1 );
		        		anOrder.addMedia(book1);
		        		
		        		Book book2 = new Book("The Lord of the Ring", "Novel", 19.95f,  "J. R. R. Tolkien", anOrder.qty()+1 );
		        		anOrder.addMedia(book2);
		        		
		        		Book book3 = new Book("Space Jam", "Novel", 19.95f,  "J. R. R. Tolkien", anOrder.qty()+1 );
		        		anOrder.addMedia(book3);
		        	}
		        	
		        	break;
		        	
		        case 3:
		        	System.out.print("Input id to remove media: ");
		        	int inputid = sc.nextInt();
		        	anOrder.removebyid(inputid);
		        	
		        	break;
		        
		        case 4:
		        	anOrder.showlist();
		        	break;
		        
		        
		        			        			      		        		        	
		        default:
		            System.out.println("Choice must be a value between 0 and 4.");
		    }   
		} while (choice != 0);
		
		sc.close();
		//DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f); 
		//anOrder.addMedia(dvd1);
		
		//Book book1 = new Book("The Hobbit", "Novel", 19.95f,  "J. R. R. Tolkien" );
		//anOrder.addMedia(book1);
		
		//System.out.print("Total Cost: ");
		//System.out.println(anOrder.totalcost());
	}

}
