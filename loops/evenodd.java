package loops;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int evensum=0;
        int oddsum=0;

        for(int i=0;i<=n;i++){
            if(i%2==0){
               evensum=evensum+i;
            }
            else{
                oddsum=oddsum+i;
            }
        }
        System.out.println("sum of evens is: "+evensum);
        System.out.println("sum of odds are: "+oddsum);
        
        sc.close();
    }
    
}
