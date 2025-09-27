package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1
	public static void greet(String text, int version) {
		System.out.println("Hello " + text + " " + version);
	}
	// Q2
	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}
	// Q3
	public static void printArray(int[] numbers) {
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	// Q4
	public static void multiply(double x, double y) {
		System.out.println(x + y);
	}
	// Q5
	public static int[] generateNumbers(int count) {
		Random rand = new Random();
		int[] numbers = new int[count];

		for (int i = 0; i < count; i++) {
			numbers[i] = rand.nextInt(100) + 1; // 1～100
			System.out.println(numbers[i]);
		}

		return numbers;
	}
	// Q6: 平均を計算して返すメソッド
	public static double calculateAverage(int[] nums) {
		double sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}

		double average = sum / nums.length;
		System.out.println("平均値: " + average);
		return average;
	}
	// Q7
	public static boolean isAverageOver50(double average) {
		boolean result = average >= 50;
		System.out.println("50以上か？: " + result);
		return result;
	}

	public static void main(String[] args) {
		// Q1
		greet("JavaSE", 11);
		// Q2
		multiply(64, 5);
		// Q3
		int[] data = { 10, 20, 30, 40, 50 };
		printArray(data);
		// Q4
		multiply(3.5, 14.5);
		// Q5
		int[] result = generateNumbers(5);
		System.out.println("戻り値の最初の要素: " + result[0]);
		// Q6
		double avg = calculateAverage(result);
		// Q7
		boolean check = isAverageOver50(avg);
	}
}
