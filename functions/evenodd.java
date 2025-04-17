package functions;

import java.util.Scanner;
public class evenodd {
    public static boolean evenornot( int n){

        if(n%2==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        System.out.println(evenornot(n));

    }
    
}
