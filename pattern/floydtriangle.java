package pattern;

import java.util.Scanner;
public class floydtriangle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int digit=1;

        for(int line=1;line<=n;line++){
            for(int num=1;num<=line;num++){
                System.out.print(digit);
                digit++;
            }
            System.out.println();
        }
    }
    
}
