class Rectangle {
	private int width, height;

	Rectangle() {
		setSize(0, 0);
	}

	Rectangle(int w, int h) {
		setSize(w, h);
	}

	void setSize(int w, int h) {
		width = w;
		height = h;
	}

	int getArea() {
		return width * height;
	}
}

public class TestRectangle {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(10, 20);
		//r1.setSize(20, 30);
		//r1.width = 5;
		System.out.println("四角形のサイズは" + r1.getArea());
	}
}
