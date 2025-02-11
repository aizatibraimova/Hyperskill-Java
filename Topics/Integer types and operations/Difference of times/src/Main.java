import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hour1 = scanner.nextInt();
        int minute1 = scanner.nextInt();
        int second1 = scanner.nextInt();

        int hour2 = scanner.nextInt();
        int minute2 = scanner.nextInt();
        int second2 = scanner.nextInt();

        int secondsInMinute1 = minute1 * 60;
        int secondsInHour1 = hour1 * 60 * 60;

        int secondsInMinute2 = minute2 * 60;
        int secondsInHour2 = hour2 * 60 * 60;

        int secondTime = second2 + secondsInMinute2 + secondsInHour2;
        int firstTime = second1 + secondsInMinute1 + secondsInHour1;

        System.out.println(secondTime - firstTime);

        scanner.close();
    }
}