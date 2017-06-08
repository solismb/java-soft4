class BasketballScoreTest {
	public static void main(String[] args) {
		BasketballScore score_cats = new BasketballScore();
		BasketballScore score_tigers = new BasketballScore();

		score_cats.addTwo();
		score_cats.addTwo();
		score_tigers.addTwo();
		score_tigers.addThree();
		score_cats.addTwo();

		System.out.println("Cats の総得点は" + score_cats.getScore() + "点");
		System.out.println("Tigers の総得点は" + score_tigers.getScore() + "点");

		System.out.println("Cats history: " + score_cats.getHistory());
		System.out.println("Tigers history: " + score_tigers.getHistory());
	}
}
		
