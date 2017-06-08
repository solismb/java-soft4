public class MonsterTest {
	public static void main(String args[]) {
		Monster m1 = new Monster(Monster.FIRE, 5);
		Monster m2 = new Monster(Monster.WATER, 5);
		Monster m3 = new Monster(Monster.FIRE, 5);
		
		Monster[] m = new Monster[5];
		for (int i = 0; i < 5; i++) {
			m[i]=new Monster(Monster.FIRE, 5);
			System.out.println(m[i]);
		}
		
		/*
		System.out.println("初期状態");
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println("m1がm2に攻撃!");
		m1.attack(m2);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println("m2がm1に攻撃!");
		m2.attack(m1);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println("m1がm3に攻撃!");
		m1.attack(m3);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println("m3がm1に攻撃!");
		m3.attack(m1);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		*/
	}
}
