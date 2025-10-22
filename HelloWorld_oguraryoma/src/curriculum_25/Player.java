package curriculum_25;

public class Player {
	private String name;
	private int hp, mp, attack, speed, defense;

	public Player(String name, int hp, int mp, int attack, int speed, int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.speed = speed;
		this.defense = defense;
	}

	public String getName() {
		return name;
	}

	public void showStatus() {
		System.out.println("ステータス");
		System.out.println("HP：" + hp);
		System.out.println("MP：" + mp);
		System.out.println("攻撃力：" + attack);
		System.out.println("素早さ：" + speed);
		System.out.println("防御力：" + defense);
	}
}
