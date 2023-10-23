public class App {
    static int number = -52452;
    static String result;

    public static void main(String[] args) throws Exception {
        if (number < 5) {
            result = String.format("%d is less than 5.", number);
        } else if (5 <= number && number <= 10) {
            result = String.format("%d is between 5 and 10 inclusive.", number);
        } else if (number > 10) {
            result = String.format("%d is greather than 10.", number);
        }
        System.out.println(result);
    }
}
