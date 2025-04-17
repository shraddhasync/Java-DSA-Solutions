package IfElse;
import java .util.Scanner;
public class dayname {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int daynum=sc.nextInt();

        if(daynum==1){
            System.out.println("monday");
        }
        else if(daynum==2){
            System.out.println("tuesday");
        }
        else if(daynum==3){
            System.out.println("wednesday");
        }
        else if(daynum==4){
            System.out.println("thursday");
        }
        else if(daynum==5){
            System.out.println("friday");
        }
        else if(daynum==6){
            System.out.println("saturday");
        }
        else if(daynum==7){
            System.out.println("sunday");
        }
        else{
            System.out.println("invalid");
        }
        sc.close();
        
    }
}