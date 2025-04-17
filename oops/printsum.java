package oops;
import java.util.Scanner;
public class printsum {
    public static void main(String[] args) {
        complex c1=new complex();
        System.out.println("enter a:");
        int c1=sc.nextInt();
        c1.printcomplexsum(0, 0);
        
        
    }
    
}
class complex{
    int a;
    int b;

    public void printcomplexsum(int a,int b){
        System.out.println(a+"+i"+b);

    }

}
