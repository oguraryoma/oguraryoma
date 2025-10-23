package curriculum29;

import java.util.*;

public class PrefectureSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8");

        Prefecture[] list = {
            new Prefecture("北海道", "札幌市", 83424),
            new Prefecture("青森県", "青森市", 9646),
            new Prefecture("岩手県", "盛岡市", 15275),
            new Prefecture("宮城県", "仙台市", 7282),
            new Prefecture("秋田県", "秋田市", 11638),
            new Prefecture("山形県", "山形市", 9323),
            new Prefecture("福島県", "福島市", 13784),
            new Prefecture("茨城県", "水戸市", 6097),
            new Prefecture("栃木県", "宇都宮市", 6408),
            new Prefecture("群馬県", "前橋市", 6362),
            new Prefecture("埼玉県", "さいたま市", 3798)
        };

        System.out.println("番号をカンマ区切りで入力してください（例: 8,5,9）：");
        String[] nums = sc.nextLine().split(",");

        System.out.println("昇順 または 降順 を入力してください：");
        String order = sc.nextLine().trim();

        sc.close();

        List<Prefecture> selected = new ArrayList<>();

        for (String num : nums) {
            try {
                int index = Integer.parseInt(num.trim());
                if (index >= 0 && index < list.length) {
                    selected.add(list[index]);
                } else {
                    System.out.println(index + " は無効な番号です。");
                }
            } catch (NumberFormatException e) {
                System.out.println(num + " は数値として認識できません。");
            }
        }

        // 並び替え（昇順 or 降順）
        selected.sort((a, b) -> {
            if (order.equals("降順")) {
                return Double.compare(b.getArea(), a.getArea());
            } else {
                return Double.compare(a.getArea(), b.getArea());
            }
        });

        System.out.println();
        for (Prefecture p : selected) {
            p.printInfo();
        }
    }
}
