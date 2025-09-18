package curriculum_B;
import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] subjects = {"英語", "数学", "理科", "社会"};

        // 生徒数を入力（2以上）
        int n;
        do {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            n = scanner.nextInt();
        } while (n < 2);

        double[][] scores = new double[n][subjects.length];

        // 各生徒の成績を入力
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < subjects.length; j++) {
                System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください : ");
                scores[i][j] = scanner.nextDouble();
            }
            System.out.println(); 
        }

        // 各生徒の平均点（各生徒の出力後に1行空ける）
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                sum += scores[i][j];
            }
            double avg = sum / subjects.length;
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), avg);
        }
        System.out.println(); 

        // 各科目の平均点 + 全体の平均
        double totalSum = 0; // ← 全体合計をここで初期化
        for (int j = 0; j < subjects.length; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scores[i][j];
            }
            double avg = sum / n;
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], avg);
            totalSum += sum;
        }

        double overallAvg = totalSum / (n * subjects.length);
        System.out.printf("全体の平均点は%.2f点です。\n", overallAvg);

        scanner.close();
    }
}
