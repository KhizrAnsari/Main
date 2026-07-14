import java.util.Scanner;
public class Greatest_Three_Using_Nested {
    public static void main(String []gg){
        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("Greatest = "+a);
            }else{
                System.out.println("Greatest = "+c);
            }
         }else{
            if(b>c)
                System.out.println("Greatest = "+b);
            else{
                System.out.println("Greatest = "+c);
            }
         }
         sc.close();
    }
}
