package testCircle;

public class TestCircle {
    double radius = 1;
    String color = "red";

    public TestCircle() {
    }

    public TestCircle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}