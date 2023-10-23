public class App {
    static double radius = 1.5;
    static double area = Math.PI * Math.pow(radius, 2);
    public static void main(String[] args) throws Exception {
         final String result = String.format("The area is %g when the radius is %g", area, radius);
        System.out.println(result);
    }
}
