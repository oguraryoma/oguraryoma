package curriculum_A;

public class Qes1_13 {
    public static void main(String[] args) {
        // ① ローカル変数の宣言（初期化せず）
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        String str;
        boolean bool;

        // ② 初期化（代入）
        b = 10;
        s = 100;
        i = 1000;
        l = 10000L;
        f = 9.5f;
        d = 10.5;
        c = 'a';
        str = "ハロー";
        bool = true;

        // ③ 出力
        System.out.println((b + s + i + l) + "\t\t" + (b + s + i + l));
        System.out.println((b * 2) + "\t\t" + (b * 2));
        System.out.println(c + " " + str + " " + bool + "\t\t" + c + " " + str + " " + bool);
        System.out.println((b + s + i + l + (int)f + (int)d) + "\t\t" + (b + s + i + l + (int)f + (int)d));
        System.out.println((long)b * s * i * l + "\t\t" + ((long)b * s * i * l));
        System.out.println((d / 100) + "\t\t" + (d / 100));
        System.out.println((b - s) + "\t\t" + (b - s));

        // ④ 文字列連結エラーの修正
        String num = "20";
        int num1 = 23;
        System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));

        // ⑤ 自己紹介（初期）
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String food = "寿司";
        double bmi = weight / ((height / 100) * (height / 100));

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + food + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");

     // ⑥ 再代入
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        food = "オムライス";
        bmi = weight / ((height / 100) * (height / 100));

        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + food + "です");
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        // ⑦ 自己代入（加算）
        height += height;
        age += age;
        weight += weight;
        bmi = weight / ((height / 100) * (height / 100));

        // 💡 ご希望のフォーマット（全角スペース入り）
        System.out.println("初めまして" + name + "です　");
        System.out.println("　年齢は" + age + "歳です　");
        System.out.println("　身長は" + height + "cmです　");
        System.out.println("　体重は" + weight + "kgです　");
        System.out.println("　好きな食べ物は" + food + "です　");
        System.out.println("　BMIは" + String.format("%.2f", bmi) + "です　");

        // ⑧ 25歳以上判定（if文なし）
        System.out.println(age >= 25);

        // ⑨ 文字列型に変換し連結
        String ageStr = String.valueOf(age);
        String heightStr = String.valueOf(height);
        String weightStr = String.valueOf(weight);
        System.out.println(ageStr + heightStr + weightStr);

        // ⑩ 整数型に変換して出力
        int parsedAge = Integer.parseInt(ageStr);
        int parsedHeight = (int) Double.parseDouble(heightStr);
        System.out.println(parsedAge);
        System.out.println(parsedHeight);

        // ⑪ 論理式で判定（25歳 or 身長160以上）
        System.out.println(parsedAge >= 25 || parsedHeight >= 160);
    }
}
