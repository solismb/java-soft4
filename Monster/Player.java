import static java.lang.Math.*;

class Player extends Monster {
	private String name;
	private int potion;
	private int hipotion;
	private int bom;
	
	Player(String name, int type, int life) {
		super(type, life);
		this.name = name;
		potion = (int)(random() * 4);
		hipotion = (int)(random() * 3);
		bom = (int)(random() * 2);
	}

	// アイテムのgetter
	int getPotion() {
		return potion;
	}
	int getHiPotion() {
		return hipotion;
	}
	int getBom() {
		return bom;
	}
	/*
	int showItem() {
		int num;

		do {
			System.out.println("### 現在所持アイテム ###");
			System.out.println("1. ポーション    : " + potion + "コ");
			System.out.println("2. ハイポーション: " + hipotion + "コ");
			System.out.println("3. 爆弾          : " + bom + "コ");
			System.out.println("0. メニューに戻る");
			System.out.print("\n使うアイテムを番号で選んでね\nアイテム: ");
			
			num = in.nextInt();
			if ()
		
			
	}
	*/
	
	void useItem(int num) {
		switch (num) {
		case 1:
			usePotion();
		}
	}
	void usePotion() {
		if (potion > 0) {
			potion--;
			setLife(getLife() + 5);
		} else {
			System.out.println("ポーションはない!");
		}
	}

	@Override
	void attack(Monster m) {
		int type = this.getType();
		int mtype = m.getType();
		//boolean alive = this.getAlive();
		//boolean malive = m.getAlive();

		if (this.getAlive() && m.getAlive()) {
			if ((type - mtype + 3) % 3 == 0) {
				System.out.println("モンスターに3のダメージ!");
				setAlive(m.damage(3));
				//m.alive = m.damage(3);
			} else if ((type - mtype + 3) % 3 == 1) {
				System.out.println("モンスターに5のダメージ!\n効果はばつぐんだ!");
				setAlive(m.damage(5));
				//m.alive = m.damage(5);
			} else {				
				System.out.println("モンスターに1のダメージ!\n効果はいまひとつのようだ");
				setAlive(m.damage(1));
				//m.alive = m.damage(1);
			}
		} else {
			System.out.println("Error");
		}
	}
	void useItem(Item i) {
	//	System.out.println(i.selectItem());
		
	}
	boolean escape() {
		if ((int)(Math.random() * 7) == 0) {
			System.out.println("逃走に成功した.");
			return true;
		} else {
			System.out.println("逃げられない!");
			return false;
		}
	}
	boolean capture() {
		int life = getLife();
		
		if (life > 3)
			return (int)(Math.random() * 7) == 0 ? true : false;
		else
			return (int)(Math.random() * (life + 1)) == 0 ? true : false;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + " (" + showType() + ") Life: " + getLife();
	}
}
