package pattern;
import java.util.Scanner;
public class righttrianglealphabet {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        char alpha='A';

        for(int line=1;line<=n;line++){
            for(int ele=1;ele<=line;ele++){
                System.out.print(alpha);
                alpha++;
            }
            System.out.println();
        }
    }
    
}
