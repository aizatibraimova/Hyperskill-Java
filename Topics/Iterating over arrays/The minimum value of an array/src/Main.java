import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        array[0] = scanner.nextInt();
        int smallestInt = array[0];
        for (int i = 1; i < array.length ; i++) {
            array[i] = scanner.nextInt();

            if (array[i] < smallestInt) {
                smallestInt = array[i];

            }
        }
        System.out.println(smallestInt);
        scanner.close();
    }
}