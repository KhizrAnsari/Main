import java.util.Scanner;

public class Largest_Three_Using_Nested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = (a > b) ? ((a > c) ? a : c)
                              : ((b > c) ? b : c);

        System.out.println("Largest = " + largest);
   sc.close();
   
    }
}