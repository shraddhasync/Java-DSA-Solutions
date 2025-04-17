package pattern;

import java.util.Scanner;
public class halfpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int num=1;num<=i;num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
    
}
