package reloop;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a=2;
        int b=1;
        do{
            System.out.println("enter operator: ");
            char operat=sc.next().charAt(0);
            if(operat =='+' ||  operat =='-' ||  operat =='*' || operat =='/'){
            if(operat=='+'){
                System.out.println(a+" + "+b+" = "+(a+b));
                break;
            }
            if(operat=='-'){
                System.out.println(a+" - "+b+" = "+(a-b));
                break;
            }
            if(operat=='*'){
                System.out.println(a+" * "+b+" = "+(a*b));
                break;

            }
            if(operat=='/'){
                System.out.println(a+" / "+b+" = "+(a/b));
                break;
            }
            
        }else{
            System.out.println("wrong input");
            break;
        }


        }while(true);
    }
    
}
