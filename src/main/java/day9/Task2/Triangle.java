package day9.Task2;

public class Triangle extends Figure {
    private int s1;
    private int s2;
    private int s3;

    public Triangle(int s1, int s2, int s3, String color) {
        super(color);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double area() {
        double area = (s1 + s2 + s3) / 2.0d;
        return Math.sqrt(area * (area - s1) * (area - s2) * (area - s3));

    }

    @Override
    public double perimeter() {
        return s1 + s2 + s3;

    }
}
