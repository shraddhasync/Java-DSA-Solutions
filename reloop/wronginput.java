package reloop;

import java.util.Scanner;
public class wronginput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=8;
        int e;

        do{  System.out.println("wrong input");
             System.out.println("wrong input");
            
            e=sc.nextInt();
           
        }while(n!=e);
    }
    
}
