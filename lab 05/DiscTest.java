package aimsproject;

public class DiscTest {

	public static void main(String[] args) {
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
		
		dvd1.search("King", dvd1);
	}

}
