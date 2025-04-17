package reloop;

import java.util.Scanner;
public class guessgame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int rando=(int)(10*Math.random()); 
        System.out.println(rando);
        
        do{
            System.out.println("enter num");
            int num=sc.nextInt();

            if(num<rando){
                System.out.println("too low");
                
            }
            if(num>rando){
                System.out.println("too high");
                
            }
            if(num==rando){
                System.out.println("guessed right");
                break;
            }
        }while(true);
            

            


        
    }
    
}
