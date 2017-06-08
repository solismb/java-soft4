public class MyPointTest2 {
	public static void main(String[] args) {

		MyPoint2 p1 = new MyPoint2();
		p1.x = 4;
		p1.y = 3;
		System.out.println("p1の座標は(" + p1.x + "," + p1.y + ")");
		System.out.println("p1の原点からの距離は" + p1.getR());
		System.out.println("角度 : " + p1.getTheta());

		MyPoint2 p2 = new MyPoint2();
		p2.x = 1;
		p2.y = 1;
		System.out.println("p2の座標は(" + p2.x + "," + p2.y + ")");
		System.out.println("p2の原点からの距離は" + p2.getR());
		System.out.println("角度 : " + p2.getTheta());
	}
}
