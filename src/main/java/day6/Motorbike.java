package day6;

public class Motorbike {
    private int age;
    private String color;
    private String model;

    public Motorbike(int age, String color, String model) {
        this.age = age;
        this.color = color;
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - getAge());

    }
}
