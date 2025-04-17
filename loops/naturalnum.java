package loops;
import java.util.Scanner;
public class naturalnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        //for(int i=0;i<=n;i++){            //print 1-n
        //   System.out.println(i);
        //}

        for(int i=n;i>=0;i--){              //print reverse loop n-1
            System.out.println(i);
        }
        sc.close();

    
    }
}
