public class BasketballScore {
	int point_two = 0;
	int point_three = 0;
	String history = "";

	public void addTwo() {
		point_two = point_two + 1;
		history = history + "[2点]-";
	}

	public void addThree() {
		point_three = point_three + 1;
		history = history + "[3点]-";
	}

	public int getScore() {
		return (point_two * 2) + (point_three * 3);
	}

	public String getHistory() {
		history = history.substring(0, history.length() - 1);
		return history;
	}
}
