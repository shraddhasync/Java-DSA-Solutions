package functions;

import java.util.Scanner;
public class decimaltobinary {

    public static void decnum(int n){
        int pow=0;
        int rem=0;
        int bin=0;

        while(n!=0){
           rem=n%2;
           bin=bin+(rem*(int)(Math.pow(10,pow)));
           pow++;
           n=n/10;

        }
        System.out.println(bin);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        decnum(n);

        
        
    }
    
}
