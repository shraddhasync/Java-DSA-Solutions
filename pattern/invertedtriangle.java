package pattern;

import java.util.Scanner;
public class invertedtriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int line=1;line<=n;line++){
            for(int zero = 1;zero<=(n-line);zero++){
                System.out.print("0 ");
            }
            for(int star=1;star<=line;star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
