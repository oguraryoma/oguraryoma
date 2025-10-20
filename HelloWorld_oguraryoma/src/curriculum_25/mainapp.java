package curriculum_25;

import java.util.Scanner;
import curriculum_25.Hero;

public class mainapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください：");
        String name = scanner.nextLine();
        scanner.close();

        Hero hero = new Hero(name);

        System.out.println();
        System.out.println("こんにちは 「" + hero.getName() + "」 さん");
        hero.showStatus();
        System.out.println();
        System.out.println("さあ冒険に出かけよう！");
    }
}
