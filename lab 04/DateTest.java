package aimsproject;

import java.util.Scanner;

public class DateTest {

	
	
	public static void main(String[] args) {
		
		MyDate date = new MyDate("Ferbuary","29", "2020");
		date.print(date);
		
		Scanner sc = new Scanner(System.in);
		date.print(date);
		System.out.print("Input Option: ");
		int option = sc.nextInt();
		
		date.chooseformat(option, date);
		
	}


}
