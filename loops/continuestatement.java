package loops;

import java.util.Scanner;
public class continuestatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        do{
            int n=sc.nextInt();
            if(n%10==0){
                continue;          //continue statement is used to skipa step/iteration
            }else{
                System.out.println(n);
            }

        }while(true);
    
    
    
    }
    
}
