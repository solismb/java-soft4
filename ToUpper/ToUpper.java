import java.io.*;

public class ToUpper {
	public static void main(String[] args) {
		System.out.print("Input String: ");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String str = in.readLine();
			System.out.println("Result: " + str.toUpperCase());
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}
