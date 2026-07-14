import java.util.Scanner;
public class Reverse_Num {
    public static void main(String []gg){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int rev=0;
        while(n>0){
            rev = rev*10+(n%10);
            n/=10;
        }
    }
}
