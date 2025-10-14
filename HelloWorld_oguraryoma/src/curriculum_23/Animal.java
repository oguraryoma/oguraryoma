package curriculum_23;

public class Animal {
    private String name;   
    private double length; 
    private int speed;     

    public Animal() {
        this.length = 2.1; 
        this.speed = 80;  
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getLength() {
        return this.length;
    }

    public int getSpeed() {
        return this.speed;
    }
}
