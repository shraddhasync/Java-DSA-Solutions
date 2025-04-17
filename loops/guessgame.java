package loops;

import java.util.Scanner;
public class guessgame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=(int)(10*Math.random());                  //math.random() default genreates random number btwn 0-1,so to take random number btwn 0-10,we put 10*
        

        int n;

        do{
            n=sc.nextInt();
            if (n>a) {
                System.out.println(" too higher");
            }
            if(n<a){
                System.out.println("too low");
            }

        }while(n!=a);

        System.out.println("correct");

    sc.close();

    }
    
}
