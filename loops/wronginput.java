package loops;

import java.util.Scanner;
public class wronginput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
       int n;

       int a=5;

       do{
        
        System.out.println("wrong input");
        n=sc.nextInt();

        
       }
       while(n!=a);

       sc.close();
    }
    
}
