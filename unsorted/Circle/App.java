public class App {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(1, "Blue");
        System.out.println(circle.getCircumfrence());
        System.out.println(circle.getRadius());
        Circle circle2 = new Circle(0, "Red");
        System.out.println(circle2.getDiameter());
        System.out.println(circle2.getColor());
    }
}
