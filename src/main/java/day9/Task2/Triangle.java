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
        double area = (this.s1 + this.s2 + this.s3) / 2.0d;
        return Math.sqrt(area * (area - this.s1) * (area - this.s2) * (area - this.s3));
    }

    @Override
    public double perimeter() {
        double p = this.s1 + this.s2 + this.s3;
        return p;

    }
}
