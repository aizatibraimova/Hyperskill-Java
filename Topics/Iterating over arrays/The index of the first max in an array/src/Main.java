import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];

        array[0] = scanner.nextInt();
        int biggestInt = array[0];
        int indexOfMax = 0;

        for (int i = 1; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > biggestInt) {
                biggestInt = array[i];
                indexOfMax = i;
            }
        }
        System.out.println(indexOfMax);
        scanner.close();
    }
}