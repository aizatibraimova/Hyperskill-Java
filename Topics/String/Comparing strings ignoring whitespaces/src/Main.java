import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String firstNo = firstLine.replace(" ", "");
        String secondNo = secondLine.replace(" ", "");

        if (firstNo.equals(secondNo)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        scanner.close();
    }
}