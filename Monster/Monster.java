class Monster {
	public static final int FIRE = 0;
	public static final int WATER = 1;
	public static final int GRASS = 2;
	
	static int monsters = 0;
	private int number;
	private int type;
	private int life;
	private boolean alive;

	Monster(int type, int life) {
		monsters++;
		number = monsters;
		this.type = type;
		this.life = life;
		this.alive = this.life > 0 ? true : false;
	}
	
	// extends用のgetter
	int getLife() {
		return life;
	}
	int getType() {
		return type;
	}
	boolean getAlive() {
		return alive;
	}

	// extends用のsetter
	void setLife(int life) {
		this.life = life;
	}
	void setAlive(boolean alive) {
		this.alive = alive;
	}

	void attack(Monster m) {
		if (this.alive && m.alive) {
			if ((this.type - m.type + 3) % 3 == 0) {  // 同じタイプの場合
				this.alive = this.damage(1);
				m.alive = m.damage(1);
			} else if ((this.type - m.type + 3) % 3 == 1) {   // mが自分に「弱い」タイプの場合
				m.alive = m.damage(3);
			} else {  // mが自分に「強い」タイプの場合
				// 何も起こらない
			}
		} else if (this.alive) {
			System.out.println("Monster No." + m.number + " はすでにノックアウトしている!");
		} else {
			System.out.println("Monster No." + this.number+ " はすでにノックアウトしている!");
		}
	}		
	boolean damage(int point) {
		life = life - point;
		
		if (life <= 0) {
			life = 0;
			System.out.println("No." + number + " はノックアウトされました。");			
			return false;
		} else {
			return true;
		}
	}
	String showType() {
		if (type == FIRE)
			return "FIRE ";
		else if (type == WATER)
			return "WATER";
		else
			return "GRASS";
	}
	String isAlive() {
		if (!alive)
			return " [KO]";
		else
			return "";
	}

	@Override
	public String toString() {
		return "No." + number + "(" + showType() + ") Life: " + life + isAlive();
	}
}
