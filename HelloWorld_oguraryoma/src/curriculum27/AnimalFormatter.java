package curriculum27;

import java.util.*;

public class AnimalFormatter {
    public static void main(String[] args) {
        // 動物名 -> 学名マップ
        Map<String, String> scientific = new LinkedHashMap<>();
        scientific.put("ライオン", "パンテラ レオ");
        scientific.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientific.put("パンダ", "アイルロポダ・メラノレウカ");
        scientific.put("チンパンジー", "パン・トゥログロディテス");
        scientific.put("シマウマ", "チャップマンシマウマ");
        scientific.put("インコ", "不明");

        Scanner sc = new Scanner(System.in, "UTF-8");
        System.out.println("コンソールに文字を入力してください");
        String line = sc.nextLine().trim();
        sc.close();

        if (line.isEmpty()) return;

        String[] entries = line.split("\\s*,\\s*");
        for (int i = 0; i < entries.length; i++) {
            String[] parts = entries[i].split("\\s*:\\s*");
            if (parts.length < 3) continue;

            String name = parts[0];
            String length = parts[1];
            String speed = parts[2];
            String sci = scientific.getOrDefault(name, "不明");

            System.out.println("動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + sci);

            if (i != entries.length - 1) System.out.println();
        }
    }
}



