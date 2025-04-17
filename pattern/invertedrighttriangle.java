package pattern;
import java.util.Scanner;
public class invertedrighttriangle {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int line=0;line<=(n-1);line++){
            for(int star=1;star<=(n-line);star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
