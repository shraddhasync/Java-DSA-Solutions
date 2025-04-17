package IfElse;
import java.util.Scanner;
public class incometax {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    
    double income=sc.nextInt();

    if(income<500000){
        
        System.out.println(income+" with 0% tax");
    }
    if(income>500000 && income<1000000){
        income=income-(0.2*income);
        System.out.println(income+" with 20% tax");
    }
    if(income>1000000){
        income=income-(0.3*income);
        System.out.println(income+" with 30% tax");
    }
    sc.close();
    
        
    }
}
