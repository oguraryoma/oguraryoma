package practice;
public class Sample {
	public static void main(String[] args) {
		System.out.println("Java練習中！");
		// 整数の代入
        int number = 10;
        
        // 文字列の代入
        String name = "太郎";
        
        // 小数の代入
        double pi = 3.14159;
        
        // 真偽値の代入
        boolean isActive = true;
        
        // 出力して確認
        System.out.println("番号 " + number);
        System.out.println("名前: " + name);
        System.out.println("pi: " + pi);
        System.out.println("isActive: " + isActive);
        
        //if文
        int score = 85;

        if (score >= 90) {
            System.out.println("優秀！");
        } else if (score >= 70 ) {
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
        
        //switch文
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            default:
                System.out.println("その他の日");
        }
        
        //for文
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        //拡張for文
        String[] fruits = {"りんご", "みかん", "ぶどう"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        //while文
        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        
     // 無限ループはコメントアウト（確認用）
        // while (true) {
        //     System.out.println("ずっと繰り返します");
        // }
        
        //do-while文
        int num = 0;
        do {
            System.out.println("num = " + num);
            num++;
        } while (num < 3);

	}
}
