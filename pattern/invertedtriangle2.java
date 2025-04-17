package pattern;

import java.util.Scanner;
public class invertedtriangle2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int line=0;line<=(n-1);line++){
            for(int zero=1;zero<=line;zero++){
                System.out.print("0 ");
            }
            for(int star=1;star<=(n-line);star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
