package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	String name;

	// Q2：フィールドに動物の数の変数を定義してください。
	int count;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	public Dog() {
		this.name = "犬"; // 名前を固定で「犬」
		this.count = 3; // 数はデフォルト1
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	public Dog(int count) {
		this.name = "犬"; // 名前は固定で「犬」
		this.count = count; // 引数で受け取った数を代入
	}

	// 名前を表示するメソッド
	public void showName() {
		System.out.println("動物の名前は: " + name);
	}

	// 数を表示するメソッド
	public void showCount() {
		System.out.println("動物の数は: " + count);
	}

	// 動作確認用
	public static void main(String[] args) {
		Dog dog1 = new Dog(); // Q3のコンストラクタ
		dog1.showName();
		dog1.showCount();

		Dog dog2 = new Dog(5); // Q4のコンストラクタ
		dog2.showName();
		dog2.showCount();
	}
}
