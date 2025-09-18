package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		   // 外側のfor文は1～9の段を表す
        /*for (int i = 1; i <= 9; i++) {
        	
            // 内側のfor文は掛けられる数を表す
            for (int j = 1; j <= 9; j++) {
            	  System.out.print(String.format("%02d", i)+" * "
            	  +String.format("%02d", j)+" = "+String.format("%02d", i * j));
            	            
            	if(j<9) {
            		System.out.print(" || ");
            	}
            }
            System.out.println(); // 改行
        }*/
		for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                // 2桁のゼロ埋め表示
                String left = String.format("%02d", i);
                String right = String.format("%02d", j);
                String result = String.format("%02d", i * j);

                // 最後の区切り「||」を制御
                if (j < 9) {
                    System.out.print(left + " * " + right + " = " + result + " || ");
                } else {
                    System.out.print(left + " * " + right + " = " + result);
                }
            }
            System.out.println(); // 改行
        }
	}
}
