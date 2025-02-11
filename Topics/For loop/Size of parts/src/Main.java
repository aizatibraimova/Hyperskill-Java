import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int fixed = 0; int reject = 0; int ready = 0;

        for (int i = 0; i < n; i++) {
            int status = scanner.nextInt();
            if (status == 1) {
                fixed++;
            } else if (status == -1) {
                reject++;
            } else if(status == 0) {
                ready++;
            }
        }
        System.out.println(ready + " " + fixed + " " + reject);
        scanner.close();
    }
}