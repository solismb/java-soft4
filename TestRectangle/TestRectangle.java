class Rectangle {
	int width, height;

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

class NamedRectangle extends Rectangle {
	String name;
	NamedRectangle() {
		name = "NO NAME";
	}
	NamedRectangle(String name) {
		this.name = name;
	}
	void setName(String name) {
		this.name = name;
	}
}

class TestRectangle {
	public static void main(String args[]) {
		NamedRectangle nr = new NamedRectangle("abc");
		System.out.println("Name: " + nr.name);
		System.out.println("width= " + nr.width + ", height= " + nr.height);

		nr.setSize(15, 20);
		System.out.println("width= " +  nr.width + ", height= " + nr.height);
		System.out.println(nr.getArea());
	}
}
