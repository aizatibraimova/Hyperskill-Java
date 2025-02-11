import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        int sumD = 0;

            scanner.nextLine();
        for (int i = 0; i < n; i++ ) {
            String grade = scanner.next();
            if (grade.equals("D")) {
                sumD++;
            } else if (grade.equals("C")) {
                sumC++;
            } else if (grade.equals("B")) {
                sumB++;
            } else if (grade.equals("A")) {
                sumA++;
            }
        }
        System.out.println(sumD + " " + sumC + " "+ sumB + " " + sumA);

        scanner.close();

    }
}