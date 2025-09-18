package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
		    for (int j = 1; j <= 9; j++) {
		    	 String left   = String.format("%03d", i);       // 3桁ゼロ埋め
	                String right  = String.format("%03d", j);       // 3桁ゼロ埋め
	                String result = String.format("%03d", i * j);   // 3桁ゼロ埋め
	                
		        if (j < 9) {
		            System.out.print(left + " x " + right + " = " + result + " || ");
		        } else {
		            System.out.print(left + " x " + right + " = " + result);
		        }
		    }
		    System.out.println();
		}
	}
}
