public class App {
    static String input = "Eleven";

    public static void main(String[] args) throws Exception {
        switch (input.toLowerCase()) {
            case "nine": 
                System.out.print("Nine ");
            case "eight":
                System.out.print("Eight ");
            case "seven":
                System.out.print("Seven ");
            case "six":
                System.out.print("Six ");
            case "five":
                System.out.print("Five ");
            case "four":
                System.out.print("Four ");
            case "three":
                System.out.print("Three ");
            case "two":
                System.out.print("Two ");
            case "one":
                System.out.println("One");
                break;
            default:
                System.out.println("Invalid input.");
        }
    }
}
