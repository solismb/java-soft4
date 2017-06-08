import java.util.Scanner;
import static java.lang.Math.*;

public class Game {
	static Scanner in = new Scanner(System.in);

	static int menu(String str) {
		int num;
		
		do {
			//System.out.println("1. こうげき   2. アイテム\n3. つかまえる 4. にげる");
			System.out.println(str);
			num = in.nextInt();
			if (1 <= num && num <= 4)
				break;
			System.out.println("対応した数字を入力してください.");
		} while (num < 1 || 4 < num);
		
		return num;	
	}

	static void showItem(Player p) {
		int num;

		do {
			System.out.println("### 現在所持アイテム ###");
			System.out.println("1. ポーション   : " + p.getPotion() + "コ");
			}
	}
	
	public static void main(String[] args) {
		String mlist = "1. こうげき   2. アイテム\n3. つかまえる 4. にげる";

		//Scanner in = new Scanner(System.in);

		int ptype = Monster.FIRE;
		int mtype = (int)(random() * 3);
		int plife = (int)(random() * 6 + 15);
		int mlife = (int)(random() * 6 + 15);
		boolean t = true;

		System.out.println("モンスターの名前とタイプを決めて下さい.");
		System.out.print("名前: ");
		String name = in.nextLine();

		while (t) {
			System.out.println("\n## タイプ一覧 ##\n0 : FIRE\n1 : WATER\n2 : GRASS");
			System.out.println("\n選びたいタイプの数字を入力して下さい.");
			System.out.print("タイプ: ");
			ptype = in.nextInt();
			if (0 <= ptype && ptype <= 2)
				t = false;
			else
				System.out.println("入力が間違ってます. やり直して下さい.");
		}
		
		Player p = new Player(name, ptype, plife);
		Monster m = new Monster(mtype, mlife);
		//Item i = new Item();

		System.out.println(p);

		System.out.println("モンスターが現れた! " + name + " はどうする?");
		//while (p.getAlive() && m.getAlive()) {
			int num = menu(mlist);
			if (num == 2) {
				showItem(p);
				//p.showItem();
				p.useItem(1);
			}
			System.out.println(p);
			//in.nextLine();
			//}
			
	}
}
