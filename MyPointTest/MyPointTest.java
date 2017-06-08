public class MyPointTest {
	public static void main(String[] args) {

		MyPoint p1 = new MyPoint();
		p1.x = 4;
		p1.y = 3;
		System.out.println("p1の座標は(" + p1.x + "," + p1.y + ")");
		System.out.println("p1の原点からの距離は" + p1.getR());

		MyPoint p2 = new MyPoint();
		p2.x = 1;
		p2.y = 1;
		System.out.println("p2の座標は(" + p2.x + "," + p2.y + ")");
		System.out.println("p2の原点からの距離は" + p2.getR());
	}
}
