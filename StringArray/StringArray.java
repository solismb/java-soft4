class StringArray {
	public static void main(String[] args) {
		String[][] sa = new String[5][3];

		System.out.println(sa.length);
		System.out.println(sa[0].length);

		for (int i = 0; i < sa.length; i++) {
			for (int j = 0; j < sa[i].length; j++) {
				sa[i][j] = "";
				for (int k = 0; k < i * j; k++)
					sa[i][j] = sa[i][j] + "*";
			}
		}

		System.out.println(sa[2][1]);
		System.out.println(sa[3][0]);
		System.out.println(sa[4][2]);
	}
}
