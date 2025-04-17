package loops;
import java.util.Scanner;
public class pallindromenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int e=sc.nextInt();

        int n =e;

        int var=0;
        
        while(n!=0){
            int a=n%10;
            var=var*10+a;
            n=n/10;
        }
        if(var==e){
            System.out.println("its pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }
        sc.close();
    }
}
