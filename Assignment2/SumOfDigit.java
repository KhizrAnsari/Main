public class SumOfDigit {
    public static void main(String []gg){
        int sum = 0;
        for(int i=1; i<=5; i++){
            sum = sum+i;
            System.out.print(i);
            if(i<5){
                System.out.print("+");
            }
            
        }
        System.out.print(" = "+sum);

    }

}
