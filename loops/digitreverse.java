package loops;
import java.util.Scanner;
public class digitreverse {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    
    while(n!=0){
       int a=n%10;
       System.out.print(a);
       n=n/10;

    }

    sc.close();
    }
    
}
