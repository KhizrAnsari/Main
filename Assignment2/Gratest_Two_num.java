    import java.util.Scanner;

    public class Gratest_Two_num {
        public static void main(String []gg){
            Scanner sc=new Scanner(System.in);
          System.out.println("Enter First Number =");
          int a = sc.nextInt();

          System.out.println("Enter Second Number =");
          int b = sc.nextInt();

          if(a>b){
            System.out.println("Greatest =" +a);
          }else{
               System.out.println("Greatest = " +b);
            sc.close();
          }
        }
}
