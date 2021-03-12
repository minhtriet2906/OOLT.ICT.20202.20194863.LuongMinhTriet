import java.util.Scanner;

public class Triangle{
	public static void main(String[] args) {
		int num, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập n: ");
		num = sc.nextInt();
		System.out.println();
		n = num;

		// vẽ tam giác khuyết đỉnh
		for (int r = 1; r <= num; r++) {
			// phần 1
			for (int sp = num - r + 1; sp >= 1; sp--) {
				System.out.print(" ");
			}
			// phần 2
			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			// phần 3
			for (int c = r - 1; c >= 1; c--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}