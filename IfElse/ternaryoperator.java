package IfElse;
import java.util.Scanner;
public class ternaryoperator {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int marks=sc.nextInt();

    String ans=(marks>33)?"pass":"fail";
    System.out.println(ans);

    sc.close();
    }
    
}
