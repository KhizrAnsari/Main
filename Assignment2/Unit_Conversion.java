import java.util.Scanner;

public class Unit_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Kilometer to Meter");
        System.out.println("2. Meter to Centimeter");
        System.out.println("3. Centimeter to Millimeter");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter kilometers: ");
                double km = sc.nextDouble();
                System.out.println("Meters = " + (km * 1000));
                break;

            case 2:
                System.out.print("Enter meters: ");
                double m = sc.nextDouble();
                System.out.println("Centimeters = " + (m * 100));
                break;

            case 3:
                System.out.print("Enter centimeters: ");
                double cm = sc.nextDouble();
                System.out.println("Millimeters = " + (cm * 10));
                break;

            default:
                System.out.println("Invalid Choice");
        }
   sc.close();
    }
}