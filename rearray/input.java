package rearray;
import java.util.Arrays;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size:");
        int n=sc.nextInt();

        int number[]=new int[n];
        int sum=0;

        for(int i=0;i<n;i++){
            System.out.println("enter num :");
            number[i]=sc.nextInt();
            sum=sum+number[i];

        }

        System.out.println(Arrays.toString(number));
        System.out.println("sum is: "+sum);
        System.out.println("mean is: "+sum/n);
        
    }
    
}
