import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String shape = scanner.nextLine();
        double a = 0, b = 0, c = 0, r = 0;

        switch(shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double s = (a + b + c)/2;
                double areaTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(areaTriangle);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                double areaRectangle = a * b;
                System.out.println(areaRectangle);
                break;
            case "circle":
                r = scanner.nextDouble();
                double areaCircle = r * r * 3.14;
                System.out.println(areaCircle);
                break;
        }
        scanner.close();
    }
}