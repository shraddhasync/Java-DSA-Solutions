package functions;

import java.util.Scanner;

public class factorials {

    public static void factorialsof(int n){
        int fact=1;

        for(int a=1;a<=n;a++){
            fact=fact*a;
            

        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        factorialsof(n);

       

        
    }
    
}
