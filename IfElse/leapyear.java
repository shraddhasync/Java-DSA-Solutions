package IfElse;
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int year=sc.nextInt();

       if(year%100==0){
         if(year%400==0){
            System.out.println("leapyear");
         }else{
            System.out.println("not a leap year");
         }
       }
       else if(year%4==0){
        System.out.println("leapyear");
       }
       else{
        System.out.println("not a leap year");
       }
       sc.close();

    }
    
}
