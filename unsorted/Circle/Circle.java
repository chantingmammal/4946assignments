public class Circle {

    double radius;
    String color;

    public Circle(double radius1, String color1) {
        radius = radius1;
        color = color1;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumfrence() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public void setColor(String newColor) {
        color = newColor;
    }
}
