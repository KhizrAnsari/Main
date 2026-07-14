import java.util.Scanner;

public class Check_Whether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0)
            System.out.println("Point lies at Origin");
        else if (y == 0)
            System.out.println("Point lies on X-axis");
        else if (x == 0)
            System.out.println("Point lies on Y-axis");
        else
            System.out.println("Point does not lie on any axis");
   sc.close();
    }
}