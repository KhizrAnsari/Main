import java.util.Scanner;
public class Calculator{
    public static void main(String []gg){
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter First Number : ");
     int num1 = sc.nextInt();

     System.out.println("Enter Second Number : ");
     int num2 = sc.nextInt();

     System.out.println("Enter Operation ( +, -, *, /):");
     char op = sc.next().charAt(0);

     switch (op){
        case '+':
            System.out.println("Result = "+ (num1+num2));
            break;

        case '-':
            System.out.println(" Result = " + (num1-num2));
            break;
        
        case '*':
            System.out.println("Result =" + (num1*num2));
            break;

        case '/':
            System.out.println("Result = "+(num1/num2));
            break;
            
        default:
        System.out.println("Please enter a valid choice : ");

     }
     sc.close();
    }
}