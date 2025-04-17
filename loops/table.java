package loops;
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int mul;
        for(int i=1;i<=10;i++){
            mul=n*i;
            System.out.println(n+" * "+i+" = "+mul);
        }
        sc.close();
    }
    
}
