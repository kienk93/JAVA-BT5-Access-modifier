package testCircle;

public class Main {
    public static void main(String[] args) {
        TestCircle circle1 = new TestCircle(10);
        circle1.getArea();
        double a = circle1.getArea();
        circle1.getRadius();
        double b = circle1.getRadius();
        System.out.println(a +" "+ b);

    }
}