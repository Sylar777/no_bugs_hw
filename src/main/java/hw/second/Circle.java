package hw.second;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void printCircleInfo() {
        System.out.println("Круг: Радиус = <" + radius + ">, Площадь = <" + calculateArea()
                + ">, Длина окружности = <" + calculateCircumference() + ">");
    }
}
