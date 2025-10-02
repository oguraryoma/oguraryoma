package JavaProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Theme2 {
	private String food;
	private String foodType;
	private String country;
	
	public Theme2() {
		this.food = "寿司";
		this.foodType = "和食";
		this.country = "日本";
	}
	public void greet() {
		System.out.println("こんにちは！ここは" + this.country + "です！");
		System.out.println("この" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.foodType + "です");
	}
	
	public void showDay() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:s");
		String formattedNow = now.format(formatter);
		System.out.println("今の現在日時は" + formattedNow +"です");
	}
}

