class ExBoxTest2 {
	public static void main(String[] args) {
		ExBox exbox1 = new ExBox(7, 5, false, '?');
		exbox1.draw();
		ExBox exbox2 = new ExBox(20, 10, false, '@');
		exbox2.draw();
		ExBox exbox3 = new ExBox(10, 10, true, '+');
		exbox3.draw();

		System.out.println("\nExBoxのインスタンスをBoxの型の変数に代入した場合");
		ExBox exbox = new ExBox(3, 2, true, '*');
		Box box = exbox;
		System.out.println(box.width);
		//System.out.println(box.height);
		//System.out.println(box.fills);
		//System.out.println(box.character);
		box.draw();
	}
}
