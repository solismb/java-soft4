import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

/*
コマンドライン引数で迷路のサイズを渡す=> $ java GenerateMaze [width] [height]

迷路生成 使用アルゴリズム: 壁のばし法

参考先:
ActionScript入門Wiki - 迷路自動生成(壁のばし法編)
http://www40.atwiki.jp/spellbound/pages/285.html
*/

public class GenerateMaze {
	private static int X, Y;
	private static int[][] map;
	private static ArrayList< Point > wall_index;
	private static int count = 1;

	static class Point {
		private int x, y;

		Point(int y, int x) {			
			this.y = y;
			this.x = x;
		}

		public int gety() {
			return this.y;
		}
		
		public int getx() {
			return this.x;
		}

		public void showPoint() {
			System.out.println(this.y + " " + this.x);
		}
	}

	static void initializeMapData() {
		map = new int[Y][X];
		
		for (int x = 0; x < X; x++) {
			map[0][x] = 1;
			map[Y - 1][x] = 1;
		}
		
		for (int y = 0; y < Y; y++) {
			map[y][0] = 1;
			map[y][X - 1] = 1;
		}

		map[1][1] = 2;          // スタート地点
		map[Y - 2][X - 2] = 3;  // ゴール地点 
	}

	static void getWallIndex() {
		wall_index = new ArrayList< Point >();
	
		for (int x = 2; x <= X - 3; x += 2) {
			wall_index.add(new Point(0, x));
			wall_index.add(new Point(Y - 1, x));
		}

		for (int y = 2; y <= Y - 3; y += 2) {
			wall_index.add(new Point(y, 0));
			wall_index.add(new Point(y, X - 1));
		}
		
	}

	static void extendWall(int y, int x) {
		int[] random = {0, 1, 2, 3};		

		final int[][] DIR = {
			{-1,  0},
			{ 1,  0},
			{ 0, -1},
			{ 0,  1}
		};

		arrayShuffle(random);
		
		for (int i = 0; i < random.length; i++) {
			int dy = DIR[random[i]][0];
			int dx = DIR[random[i]][1];

			if (x + dx < 0 || X <= x + dx || y + dy < 0 || Y <= y + dy)
				continue;

			if (map[y + dy * 2][x + dx * 2] != 1) {
				map[y + dy][x + dx] = 1;
				map[y + dy * 2][x + dx * 2] = 1;

				extendWall(y + dy * 2, x + dx * 2);
			}
		}

		if (wall_index.size() != count) {
			Point point = wall_index.get(count);
			//System.out.println("count: " + count);
			count++;
			
			extendWall(point.gety(), point.getx());
		}
	}

	static void arrayShuffle(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = (int)(Math.random() * array.length);
			int k = array[i];
			array[i] = array[j];
			array[j] = k;
		}
	}

	static void printMaze()	{
		for (int y = 0; y < Y; y++) {
			for (int x = 0; x < X; x++) {
				if (map[y][x] == 1)
					System.out.print("壁");
				else if (map[y][x] ==  2)
					System.out.print("S ");
				else if (map[y][x] == 3)
					System.out.print(" G");
				else
					System.out.print("  ");
			}
			System.out.print("\n");
		}
	}
	
			
	public static void main(String[] args) {
		int len = args.length;
		
		if (len < 2 || len > 2) {
			System.out.println("エラーが発生しました. 引数を確認して下さい.");
			System.exit(1);
		}

		try {
			X = Integer.parseInt(args[0]);
			Y = Integer.parseInt(args[1]);

			//System.out.println("通ってる");
		} catch (NumberFormatException e) {
			System.out.println("例外: " + e);
			System.out.println("引数を整数で入力して下さい.");
			System.exit(1);
		}

		if ((X % 2) == 0 || (Y % 2) == 0) {
			System.out.println("引数に偶数は認められません.");
			System.exit(1);
		}
		
		//map = new int[Y][X];

		getWallIndex();

		/*
		System.out.println("y x");
		for (Iterator< Point > it = wall_index.iterator(); it.hasNext();) {
			it.next().showPoint();
		}
		*/

		Collections.shuffle(wall_index);
		/*
		System.out.print("\n");
		
		System.out.println("y x");
		for (Iterator< Point > it = wall_index.iterator(); it.hasNext();) {
			it.next().showPoint();
		}
		*/

		initializeMapData();
		/*
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map[y].length; x++) {
				System.out.print(map[y][x] + " ");
			}
			System.out.print("\n");
		}

		System.out.println(wall_index.size());

		System.out.print("\n");
		*/

		Point point = wall_index.get(0);
		
		extendWall(point.gety(), point.getx());
		//extendWall();
		printMaze();
		
		/*
		for (int[] i: map) {
			for (int j: i) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
		*/

		//printMaze(map);
	
	}
}
