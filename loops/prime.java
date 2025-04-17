package loops;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int a=0;

        for(int i=2;i<=(n-1);i++){
            if(n%i==0){
                a=a+1;
            }
            else{

            }
        }
        if(a==0){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        sc.close();

        
    }
    
}
