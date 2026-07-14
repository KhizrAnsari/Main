import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int root = (int)Math.sqrt(n);

        if (root * root == n)
            System.out.println(n + " is a Perfect Square");
        else
            System.out.println(n + " is not a Perfect Square");
    sc.close();
    }
}