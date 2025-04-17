package functions;

import java.util.Scanner;
public class primerange {

    public static boolean isprime(int n){
        
        int check=0;
        for(int a=2;a<=(n-1);a++){
            if(n%a==0){
                check=check+1;
            }
            else{

            }
        }
        if(check!=0){
           return false;
        }
        else{
            return true;
        }


    }
    public static void main(String[] args) {
        
        int n=50;
        
        for(int b=1;b<=50;b++){

             if(isprime(b)){
                System.out.println(b);
            }
        }
        
    
    }
}
