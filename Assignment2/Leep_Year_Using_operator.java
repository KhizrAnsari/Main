import java.util.Scanner;

public class Leep_Year_Using_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        String result = ((year % 400 == 0) ||
                        (year % 4 == 0 && year % 100 != 0))
                        ? "Leap Year"
                        : "Not a Leap Year";

        System.out.println(result);
    sc.close();
    }
}