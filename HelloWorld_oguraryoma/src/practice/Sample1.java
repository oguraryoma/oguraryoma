package practice;
public class Sample1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // 偶数のときだけ表示する
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
