package loops;
import java.util.Scanner;
public class automorphicnum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();

    int copy = n;

    int sqr=n*n;
    int m=0;

    while(n!=0) {
       int digit=sqr%10; 
       m=m*10+digit;

       sqr = sqr/10;
       n=n/10;
    }
    System.out.println(m);


    int mCopy = 0;

    while(mCopy!=0){
        int digit = mCopy%10;
         
    }


    sc.close();
    }

    
}
