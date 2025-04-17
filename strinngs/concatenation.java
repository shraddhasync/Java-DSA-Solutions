package strinngs;
import java.util.Scanner;
public class concatenation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String firstname=sc.nextLine();
        String lastname=sc.nextLine();

        String fullname=firstname+" "+lastname;
        System.out.println(fullname);

    }
    
}
//concatenation-adding two strings