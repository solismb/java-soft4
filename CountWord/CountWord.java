import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		int word = 0;

		while(true) {
			System.out.print("Input String: ");

			Scanner in = new Scanner(System.in);
			String str = in.nextLine();

			if (!Character.isWhitespace(str.charAt(0)))
				word = 1;
			
			for (int i = 0; i < str.length(); i++)
				if ((Character.isWhitespace(str.charAt(i)) || str.charAt(i) == '\'')
					&& !Character.isWhitespace(str.charAt(i+1)))
					word++;

			System.out.println(word + " words");
			word = 0;
		}
	}
}
