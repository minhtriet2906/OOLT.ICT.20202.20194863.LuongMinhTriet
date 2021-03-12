import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double num1 = sc.nextDouble();
	double num2 = sc.nextDouble();
	
	double sum = num1 + num2;
	double diff = num1 - num2;
	double pro = num1*num2;
	double quo = num1/num2;
	
	System.out.println(sum);
	System.out.println(diff);
	System.out.println(pro);
	System.out.println(quo);
	}
}
