import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int maxDivisibleBy4 = -1;

        int i = 0;
        while (i < n) {
            int number = scanner.nextInt();
            if (number % 4 == 0) {
                if (number > maxDivisibleBy4) {
                    maxDivisibleBy4 = number;
                }
            }
            i++;
        }
        System.out.println(maxDivisibleBy4);
        scanner.close();
    }
}