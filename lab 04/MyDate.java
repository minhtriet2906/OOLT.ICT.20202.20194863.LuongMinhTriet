package aimsproject;

import java.util.Scanner;

public class MyDate {
	private String day;
	private String month;
	private String year;
	
	public MyDate(String month, String day, String year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public static void print(MyDate date) {
		String day = date.getDay();
		if (day == "1" || day == "11" || day == "21" || day == "31") day = day + "st";
		else if (day == "2" || day == "12" || day == "22") day = day + "nd";
		else if (day == "3" || day == "13" || day == "23") day = day + "rd";
		else day = day + "th";
		date.setDay(day) ;
		System.out.print(date.getMonth());
		System.out.print(" ");
		System.out.print(date.getDay());
		System.out.print(" ");
		System.out.println(date.getYear());
	}

	public static void chooseformat(int option, MyDate date) {
		if(option == 1) {
			System.out.println("1.yyyy-MM-dd ");
			System.out.print(date.getYear());
			System.out.print("-");
			System.out.print(date.getMonth());
			System.out.print("-");
			System.out.print(date.getDay());
		}
		else if(option == 2) {
			System.out.println("2.d/M/yyyy ");
			System.out.print(date.getDay());
			System.out.print("/");
			System.out.print(date.getMonth());
			System.out.print("/");
			System.out.print(date.getYear());
		}
		else if(option == 3) {
			System.out.println("3.dd-MMM-yyyy ");
			System.out.print(date.getDay());
			System.out.print("-");
			System.out.print(date.getMonth());
			System.out.print("-");
			System.out.print(date.getYear());
		}
		else if(option == 4) {
			System.out.println("4.MMM d yyyy ");
			System.out.print(date.getMonth());
			System.out.print(" ");
			System.out.print(date.getDay());
			System.out.print(" ");
			System.out.print(date.getYear());
		}
		else if(option == 5) {
			System.out.println("5.mm-dd-yyyy ");
			System.out.print(date.getMonth());
			System.out.print("-");
			System.out.print(date.getDay());
			System.out.print("-");
			System.out.print(date.getYear());
		}
	}
	
	
	
}
