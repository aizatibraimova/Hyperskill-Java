import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int count = 0;
        for (int i = 1; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                System.out.println(i + " ");
                count++;
            }
        }
        scanner.close();
    }
}