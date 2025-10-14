package curriculum_23;

public class Main {

    public static void main(String[] args) {
        Animal lion = new Animal(); 
        lion.setName("ライオン");

        System.out.println("動物名は：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
    }
}
