class StringChar {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[1]);
			if (i < args[0].length() && i >= 0)
				System.out.println(args[0].charAt(i));
			else
				System.out.println("Invalid input.");			
		} catch (NumberFormatException e) {
			System.out.println("Too few arguments.");
		}
	}
}
			
		

		
