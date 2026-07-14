import java.util.Scanner;

public class Absolute_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            n = -n;
  
        System.out.println("Absolute Value = " +n);
        }else{
            n = +n;
            System.out.println("Absolute Value = " +n);
        }
    sc.close();
    }
}