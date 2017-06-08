class Box {
	int width;
	Box() {
		width = 0;
	}
	Box(int w) {
		width = w;
	}

	void draw() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
