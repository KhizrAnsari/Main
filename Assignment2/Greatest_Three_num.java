    import java.util.Scanner;

public class Greatest_Three_num {
 public static void main(String []gg){
    Scanner sc =new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a > b && a > c){
        System.out.println("Greatest = "+a);
     } else if(b>c){
            System.out.println("Greatest = "+b);
        }
        else{
            System.out.println("Greatest = "+c);
        }
         sc.close();

    }
}
