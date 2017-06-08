import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("input x : ");
		int x = in.nextInt();
		System.out.print("iput y : ");
		int y = in.nextInt();

		System.out.println("x + y : " + (x + y));
	}
}
