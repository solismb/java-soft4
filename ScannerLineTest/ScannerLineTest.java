import java.util.Scanner;

public class ScannerLineTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		System.out.println("result : " + (s1+s2));
	}
}

