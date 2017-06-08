import java.util.Scanner;

class Item {
	Scanner in = new Scanner(System.in);
	private int potion;
	private int hipotion;
	private int bom;

	Item() {
		potion = (int)(Math.random() * 4);
		hipotion = (int)(Math.random() * 3);
		bom = (int)(Math.random() * 2);
	}

	int getPotion() {
		return potion;
	}
	int getHiPotion() {
		return hipotion;
	}
	int getBom() {
		return bom;
	}		

	void showItem() {
		System.out.println("### 現在所持アイテム ###");
		System.out.println("1. ポーション    : " + potion);
		System.out.println("2. ハイポーション: " + hipotion);
		System.out.println("3. 爆弾          : " + bom);
		System.out.println("4. つり竿        : (ここでは使えない)");
		System.out.println("0. メニューに戻る");
		System.out.print("使うアイテムを番号で選んでね\nアイテム: ");
	}
	/*
	int selectItem() {
		boolean temp = true;
		
		while (temp) {
			showItem();
			int num = in.nextInt();
			if (0 <= num && num <= 4) {
				temp = false;
				return num;
			} else {
				System.out.println("入力が間違ってます. やり直して下さい.");
			}
		}
	}
	*/
			
	
}
