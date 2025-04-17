package loops;

import java.util.Scanner;
public class calculatordowhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        char operator = '+';

        int check = 0;
        
        do{  
            int a=sc.nextInt();
            int b=sc.nextInt();


            System.out.println("enter operator: ");
            operator=sc.next().charAt(0);

            switch(operator){
                case '+':System.out.println(a+b);
                break;
                case '-':System.out.println(a-b);
                break;
                case '/':System.out.println(a/b);
                break;
                case '*':System.out.println(a*b);
                break;
                case '%':System.out.println(a%b);
                break;
            }

            System.out.println("Do you want to continue ? 1/0");
            check = sc.nextInt();


        }while(check != 0);
    }
    
}
