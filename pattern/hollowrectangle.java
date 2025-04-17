package pattern;

import java.util.Scanner;
public class hollowrectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int line=1;line<=n;line++){
            if(line==1){
                for(int star=1;star<=n;star++){
                    System.out.print("* ");
                }
              
            }
            if(line>=2 & line<=(n-1)){
                for(int star=1;star<=n;star++){
                    if(star==1){
                        System.out.print("* ");
                    }
                    if(star>=2 & star<=(n-1)){
                        System.out.print("  ");
                    }
                    if(star==n){
                        System.out.print("* ");
                    }
                }

            }
            if(line==n){
                for(int star=1;star<=n;star++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
    }
}