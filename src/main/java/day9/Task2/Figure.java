package day9.Task2;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    //Реализация метода должна возвращать площадь фигуры,
    public abstract double area();

    //реализация метода должна возвращать периметр фигуры.
    public abstract double perimeter();
}
