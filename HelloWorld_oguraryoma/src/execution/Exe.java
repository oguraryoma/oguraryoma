package execution;

import javaProject.Theme2;// Theme2クラスを利用するためにインポート

public class Exe {
	public static void main(String[] args) {
		// Theme2クラスのインスタンスを生成
		Theme2 theme = new Theme2();
		// あいさつと食べ物の紹介を行う
		theme.greet();
		// 現在の日時を表示する
		theme.showDay();

	}
}
