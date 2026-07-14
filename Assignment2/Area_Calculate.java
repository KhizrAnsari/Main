import java.util.Scanner;

public class Area_Calculate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.print("Enter Radius: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle = " + (3.14 * r * r));
                break;

            case 2:
                System.out.print("Enter Side: ");
                double s = sc.nextDouble();
                System.out.println("Area of Square = " + (s * s));
                break;

            case 3:
                System.out.print("Enter Length and Breadth: ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Area of Rectangle = " + (l * b));
                break;

            case 4:
                System.out.print("Enter Base and Height: ");
                double base = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println("Area of Triangle = " + (0.5 * base * h));
                break;

            default:
                System.out.println("Invalid Choice");
        }
   sc.close();
    }
}