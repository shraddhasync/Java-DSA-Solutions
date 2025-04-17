package loops;

import java.util.Scanner;
public class digitsum {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    
    int ans=0;

    while(n!=0){
        int m=n%10;
        ans=ans+m;
        n=n/10;
    }
    System.out.println(ans);
    
    sc.close();
    }
    
}
