import java.util.Random;

public class App {
    static int[] inputArray;
    static int number1 = 42;
    static int number2 = 33;
    static int howManyFound1 = 0;
    static int howManyFound2 = 0;
    static String result;

    public static void main(String[] args) throws Exception {
        fillInputArray();

        // Display the array, and check if the numbers are found.
        for (int indice = 0; indice < inputArray.length; indice++) {
            System.out.print(inputArray[indice] + " ");
            if (inputArray[indice] == number2) {
                howManyFound2++;
            }
            if (inputArray[indice] == number1) {
                howManyFound1++;
            }
        }
        System.out.println("");

        // Print out if the numbers are found
        if (howManyFound1 > 0 && howManyFound2 > 0) {
            result = String.format("Found both numbers (%d, %d)", number1, number2);
            System.out.println(result);
        }
        if (howManyFound1 > 0 && howManyFound2 == 0) {
            result = String.format("Found number 1 (%d)", number1);
            System.out.println(result);
        }
        if (howManyFound1 == 0 && howManyFound2 > 0) {
            result = String.format("Found number 2 (%d)", number2);
            System.out.println(result);
        }
        if (howManyFound1 == 0 && howManyFound2 == 0) {
            result = String.format("Numbers were not found (%d, %d)", number1, number2);
            System.out.println(result);
        }

        // Display the indices for number1
        if (howManyFound1 > 0) {
            if (howManyFound1 == 1) {
                result = String.format("Number 1 (%d) is found in position: ", number1);
            } else {
                result = String.format("Number 1 (%d) is found in positions: ", number1);
            }
            System.out.print(result);
            for (int indice = 0; indice < inputArray.length; indice++) {
                if (inputArray[indice] == number1) {
                    // Add 1 because arrays are 0 to length-1, but position is 1 to length.
                    System.out.print((indice + 1) + " ");
                }
            }
            System.out.println("");
        }

        // Display the indices for number2
        if (howManyFound2 > 0) {
            if (howManyFound2 == 1) {
                result = String.format("Number 2 (%d) is found in position: ", number2);
            } else {
                result = String.format("Number 2 (%d) is found in positions: ", number2);
            }
            System.out.print(result);
            for (int indice = 0; indice < inputArray.length; indice++) {
                if (inputArray[indice] == number2) {
                    // Add 1 because arrays are 0 to length-1, but position is 1 to length.
                    System.out.print((indice + 1) + " ");
                }
            }
            System.out.println("");
        }
    }

    // This was dad's idea, so hard!
    public static void fillInputArray() {
        Random generator = new Random();
        int arraySize = generator.nextInt(100) + 1;
        inputArray = new int[arraySize];
        for (int indice = 0; indice < inputArray.length; indice++) {
            inputArray[indice] = generator.nextInt(100) + 1;
        }
    }
}
