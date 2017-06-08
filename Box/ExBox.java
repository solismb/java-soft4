class ExBox extends Box {
	int height;  // 縦の長さ
	boolean fills;  // 箱を塗りつぶすならtrue
	char character;  // 箱を描画する文字

	ExBox(int w, int h, boolean f, char c) {
		width = w;
		height = h;
		fills = f;
		character = c;
	}

	@Override
	void draw() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (fills) {
					System.out.print(character);
				} else {
					if (i != 0 && j != 0 && i != height - 1 && j != width - 1)
						System.out.print(' ');
					else
						System.out.print(character);
				}
			}
			System.out.println();
		}
	}
}
