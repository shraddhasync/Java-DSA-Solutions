package loops;
import java.util.Scanner;
public class strongnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int e = sc.nextInt();

        int n=e;

        int Sum = 0;
        
        //Each Digit ke liye loop
        while(n!=0){
            int digit = n%10;
            n = n/10;

            int factSum = 1;

            //Each Digit ka Factorial Calculate karne ke liye Loop
            for(int i=1;i<=digit;i++){
                factSum = factSum*i;
            }

            Sum = Sum + factSum;
        }

        if(Sum == e){
            System.out.println("Strong");
        }else{
            System.out.println("Not Strong");
        }
        sc.close();
    }
}