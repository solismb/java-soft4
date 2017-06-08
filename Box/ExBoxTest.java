class ExBoxTest {
	public static void main(String args[]) {
		ExBox exbox1 = new ExBox(10, 3, true, '*');
		exbox1.draw();
		ExBox exbox2 = new ExBox(8, 5, false, '#');
		exbox2.draw();
		ExBox exbox3 = new ExBox(10, 5, false, 'O');
		exbox3.draw();
	}
}
