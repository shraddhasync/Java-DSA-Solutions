package reloop;
import java.util.Scanner;

public class automorphicnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int sqr=n*n;
        
        int check=0;

        while(n!=0){
            int slastdigit=sqr%10;
            int nlastdigit=n%10;
            if(slastdigit==nlastdigit){
                check=check+1;
            }
            sqr=sqr/10;
            n=n/10;
        }
        if(check>0){
            System.out.println("automorphic");
        }
        else{
            System.out.println("not automorphic");
        }


        
    }
    
}
