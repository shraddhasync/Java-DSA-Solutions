package IfElse;
import java.util.Scanner;
public class positivenegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        int num=sc.nextInt();

        if(num<0){
            System.out.println("negative");
        }else{
            System.out.println("positive");
        }
        sc.close();
    }
    
}
