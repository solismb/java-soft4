import java.util.Scanner;

public class SumTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input number : ");
		int x = in.nextInt();
		System.out.print("Input number : ");
		int y = in.nextInt();
		System.out.print("Input number : ");
		int z = in.nextInt();

		System.out.println("sum : " + (x + y + z));
		System.out.println("average : " + (double)(x + y + z) / 3);
	}
}
