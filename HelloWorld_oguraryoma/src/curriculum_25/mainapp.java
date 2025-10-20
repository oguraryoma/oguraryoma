package curriculum_25;

import java.util.Scanner;

public class mainapp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("名前を入力してください：");
		String name = scanner.nextLine();

		Hero hero = new Hero(name);

		System.out.println();
		System.out.println("こんにちは「" + hero.getName() + "」さん");
		hero.showStatus();
		System.out.println("さあ冒険に出かけよう！");

		scanner.close();
	}
}
