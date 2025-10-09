package javaProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2 {
	// フィールド（食べ物、食べ物の種類、国）
	private String food;
	private String foodType;
	private String country;

	/**
	* コンストラクタ
	* 初期値として「寿司」「和食」「日本」を設定
	*/
	public Theme2() {
		this.food = "寿司";
		this.foodType = "和食";
		this.country = "日本";
	}

	/**
	* あいさつと食べ物の紹介を行うメソッド
	*/
	public void greet() {
		System.out.println("こんにちは！ここは" + this.country + "です！");
		System.out.println("この" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.foodType + "です");
	}

	/**
	* 現在の日時を表示するメソッド
	*/
	public void showDay() {
		// 現在時刻を取得
		LocalDateTime now = LocalDateTime.now();

		// 表示フォーマットを指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");

		// フォーマットに従って文字列に変換
		String formattedNow = now.format(formatter);

		// 現在日時を表示
		System.out.println("今の現在日時は" + formattedNow + "です");
	}
}
