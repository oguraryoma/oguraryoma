package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 入力用のオブジェクトを作成

		String input = scanner.nextLine(); // 名前を入力

		// カンマで分割
		String[] items = input.split("、");

		//String[] items = {"パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ"};
		Random random = new Random();

		// 拡張for文で在庫一覧を表示
		int numtv = random.nextInt(11);
		for (String item : items) {
			int num = (int) (Math.random() * 12);

			switch (item) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + num + "台です");
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + num + "台です");
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + num + "台です");
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + num + "台です");
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + num + "台です");
				break;
			case "テレビ":
			case "ディスプレイ":
				System.out.print(item + "の残り台数は");
				System.out.println(item.equals("テレビ") ? numtv + "台です" : (11 - numtv) + "台です");
				break;
			default:
				System.out.println("「" + item + "」は指定の商品ではありません");
			}
			System.out.println();
			scanner.close();
		}
	}
}
