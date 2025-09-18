package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 入力用のオブジェクトを作成

		String name = scanner.nextLine(); // 名前を入力
		int number = name.length(); // 名前の長さを取得

		// if文(名前のチェック)
		if (number > 10) {
			System.out.println("「名前を10文字以内にしてください」");
			System.out.println();
		} else if (name == null || name.length() <= 0) {
			System.out.println("「名前を入力してください」");
			System.out.println();
		} else if (!name.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("「半角英数字のみで名前を入力してください」");
			System.out.println();
		} else {
			System.out.println("ユーザー名「" + name + "」登録しました。");
		}

		// じゃんけん処理
		String[] hands = { "グー", "チョキ", "パー" };
		Random random = new Random();

		int count = 0; // じゃんけん回数を数える変数

		while (true) { // 勝つまで繰り返す
			count++; // じゃんけんした回数を増やす

			int myhand = random.nextInt(hands.length); // 0〜2の乱数
			int yourhand = random.nextInt(hands.length); // 0〜2の乱数

			System.out.println(name + "の手は「" + hands[myhand] + "」");
			System.out.println("相手の手は「" + hands[yourhand] + "」");
			System.out.println();

			// 勝敗判定
			if (myhand == yourhand) {
				System.out.println("DRAW あいこ もう一回しましょう！");
				System.out.println();
			} else if ((myhand == 0 && yourhand == 1) || // グー vs チョキ
					(myhand == 1 && yourhand == 2) || // チョキ vs パー
					(myhand == 2 && yourhand == 0)) { // パー vs グー
				System.out.println("やるやん。");
				System.out.println("次は、俺にリベンジさせて");
				System.out.println();
				break; // 勝ったらループを抜ける
			} else if (myhand == 0 && yourhand == 2) { // グーでパーに負け
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				System.out.println();
			} else if (myhand == 1 && yourhand == 0) { // チョキでグーに負け
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				System.out.println();
			} else if (myhand == 2 && yourhand == 1) { // パーでチョキに負け
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				System.out.println();
			}
		}

		//最後に勝つまでの回数を表示
		System.out.println("勝つまでにかかった合計回数は" + count + "回です");
	}
}
