public class RepeatPrint {
	String s = "*";
	private int count = 1;

	RepeatPrint(int count) {
		this.count = count;
	}
	RepeatPrint(String s) {
		this.s = s;
	}
	RepeatPrint(String s, int count) {
		this.s = s;
		this.count = count;
	}
	RepeatPrint(int x, int count) {
		this.s = "" + x;
		this.count = count;
	}
	void draw() {
		for (int i = 0; i < count; i++)
			System.out.print(s);
		System.out.println();
	}
	void draw(String separator) {
		for (int i = 0; i < count; i++) {
			System.out.print(s);
			if (i < count - 1) {
				System.out.print(separator);
			} else {
				System.out.println();
			}
		}
	}
	void draw(boolean doReturn) {
		if (doReturn) {
			for (int i = 0; i < count; i++)
				System.out.println(s);
		} else {
			draw();
		}
	}
}
