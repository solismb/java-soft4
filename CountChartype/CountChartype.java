import java.io.*;

public class CountChartype {
	public static void main(String[] args) {
		int alpha = 0, num = 0;
		
		System.out.print("Input String: ");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String str = in.readLine();
			
			for (int i = 0; i < str.length(); i++) {
				if (Character.isLetter(str.charAt(i)))
					alpha++;
				else if (Character.isDigit(str.charAt(i)))
					num++;
			}

			System.out.println("Alphabet: " + alpha);
			System.out.println("Number: " + num);
		} catch (IOException e) {
			System.out.println("error.");
		}
	}
}
		
					
