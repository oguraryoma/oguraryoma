package qes32;

public class Person {
  private static int count = 0;
  private String firstName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  // 既存のコンストラクタ（lastNameなし）
  public Person(String firstName, int age, double height, double weight) {
    this.firstName = firstName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    Person.count++;
  }

  // 問題2・3：lastNameを引数で受け取るコンストラクタを追加
  public Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    Person.count++;
  }

  public String fullName() {
    return this.lastName != null ? this.lastName + this.firstName : this.firstName;
  }

  public void print() {
    System.out.println("名前は" + this.fullName() + "です");
    System.out.println("年は" + this.age + "です");
    System.out.printf("BMIは%.2fです%n", this.bmi());
  }

  public double bmi() {
    return this.weight / (this.height * this.height);
  }

  public static void printCount() {
    System.out.println("合計" + count + "人です");
  }
}
