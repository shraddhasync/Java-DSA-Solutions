package functions;
import java.util.Scanner;

public class primeornot {
    public static boolean priming(int n){

        int check=0;

        for(int a=2;a<=(Math.sqrt(n));a++){
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
        
        System.out.println(priming(100));
        
}
    
}
