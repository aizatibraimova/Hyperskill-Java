import java.util.*;

public class Main {
    // Method to read input from user and separate the integers
    public static void processInputAndCallFunctions() {
        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();
        String[] strArr = inputString.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        // Call the appropriate function depending on the number of integers in the input
        if (intArr.length == 2) {
            // Call calculate(int, int) 
            // TO DO: Fill in the appropriate code here
            int result = calculate(intArr[0], intArr[1]);
            System.out.println(result);
        } else if (intArr.length == 3) {
            // Call calculate(int, int, int)
            int result = calculate(intArr[0], intArr[1], intArr[2]);
            System.out.println(result);
            // TO DO: Fill in the appropriate code here
        }
        else {
            System.out.println("Invalid input");
        }
        scn.close();
    }

    public static int calculate(int a, int b) {
        return a * b;
    }

    public static int calculate(int a, int b, int c) {
        return (a + b) * c;
    }

    public static void main(String[] args) {
        processInputAndCallFunctions();
    }
}