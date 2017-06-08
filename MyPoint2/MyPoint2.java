public class MyPoint2 {
	int x = 0;
	int y = 0;

	public double getR() {
		double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return r;
	}

	public double getTheta() {
		return Math.atan2(y, x);
	}
}
