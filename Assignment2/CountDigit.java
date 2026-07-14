
import java.util.Scanner;
public class CountDigit {
public static void main(String []gg){
    Scanner sc =new Scanner(System.in);
    int n,count = 0;
    System.out.println("Enter a Number : ");
    n = sc.nextInt();
    
    while(n>0){
        n =n/10;
        count++;

    }
    System.out.println("Number of Digit = " +count);
    sc.close();

}
}
