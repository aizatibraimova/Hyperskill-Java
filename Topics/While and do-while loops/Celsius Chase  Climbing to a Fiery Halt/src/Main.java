import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxTemperature = 0; // Initialize maximum temperature observed

        // Add your while loop or do-while loop here to process input temperatures
        while (true) {
            int temperature = scanner.nextInt();

            if (temperature >= 100) {
                break;
            }
            if (temperature > maxTemperature) {
                maxTemperature = temperature;
            }
        }

        System.out.println(maxTemperature);

        scanner.close(); // Close the scanner
    }
}